package com.cargo.upload_car.service.IMP;

import com.alibaba.fastjson.JSON;
import com.cargo.upload_car.dao.ielts.FindCar;
import com.cargo.upload_car.entity.Car;
import com.cargo.upload_car.entity.CarConfig;
import com.cargo.upload_car.service.IfiandID;
import com.cargo.upload_car.util.IdWorker;
import com.cargo.upload_car.util.RandomUtil;
import com.cargo.upload_car.util.Send;
import com.cargo.upload_car.util.SendCar;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
@Service
public class FindIDImpl implements IfiandID {
    private Integer setRequest_id = 0;
    ArrayList<String> AreaCode = new ArrayList<String>();

    String ProvA[] = {"河北", "山西", "内蒙古", "辽宁", "吉林", "黑龙江", "上海", "江苏", "浙江", "安徽", "福建", "江西", "山东", "河南", "湖北", "湖南", "广东", "广西", "海南",
            "重庆", "四川", "贵州", "云南", "西藏", "陕西", "甘肃", "青海", "宁夏", "新疆"};

    String Carlength[] = {"47","48","49","50","51","52","53","54","55", "49,50", "52,53","44,45"};
    String CarModel[] =  {"19","20","37","38","40","41","43", "101","103","37,38"};
    String Username[] =  {"货站","货代","货运部","信息部","三方货运"};

    long  loadtm[] =  {53200L,  89400L,86400L*2, 86400L*3};
    int Maxid=-1;


    @Autowired
    public FindCar findCar;

    public IdWorker IdWorker1= new IdWorker();

    public String[] toArrayByFileReader1(String name) {
        // 使用ArrayList来存储每行读取到的字符串
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(name);
            BufferedReader bf = new BufferedReader(fr);
            String str;
            // 按行读取字符串
            while ((str = bf.readLine()) != null) {
                arrayList.add(str);
            }
            bf.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 对ArrayList中存储的字符串进行处理
        int length = arrayList.size();
        String[] array = new String[length];
        for (int i = 0; i < length; i++) {
            String s = arrayList.get(i);
            array[i] = s;
        }
        // 返回数组
        return array;
    }

    public static InputStream getResourceAsStream(String path){
        return Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
    }

    public ArrayList<String> toArrayByFileReader2(String name) {

        ArrayList<String> list = new ArrayList<String>();

        StringBuilder sb = new StringBuilder();
        String line = "";
        //InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("/application.properties");
        InputStream inputStream = null;

        ClassPathResource resource = new ClassPathResource(name);
        try {
            inputStream = resource.getInputStream();
        } catch (Exception E) {
            return null;
        }
        ;

        if (inputStream == null) return null;

        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
//    int  i=0;//   array//=br.lines().toArray( );
        while (true) {
            try {
                line = br.readLine();
            } catch (Exception E) {
                break;
            }
            ;

            if (line == null) break;
            list.add(line);

        }
        String[] array = new String[list.size()];

        return list;

    }


    String FindCityIDReal(String ID1) {         //City="甘肃省兰州市城关区";

        //ID1= "441900";

        if ( ID1.equals("310000") ) {ID1="310100";return ID1; }   //上海
        if ( ID1.equals("110000") ) {ID1="110100";return  ID1; }   //北京
        if ( ID1.equals("120000") ) {ID1="120100";return  ID1; }   //tianjin
        if ( ID1.equals("500000") ) {ID1="500100";return  ID1; }   //重庆


        for (int i = 0; i < AreaCode.size(); i++) {
            String s = AreaCode.get(i);
            int j = s.indexOf(ID1);
            if (j >= 0) {
                return ID1;
            }
        }
        //return ID1;

        return "371082";

    }

    String FindCityID(String City) {         //City="甘肃省兰州市城关区";

        if (AreaCode.size() < 10) {
            return "371003";
        }

        try {
            if (City.equals("")) {
                int max = AreaCode.size() - 20;
                int min = 2;
                long randomNum = System.currentTimeMillis();
                int ran3 = (int) (randomNum % (max - min) + min);

                String RREE = AreaCode.get(ran3);
                RREE = RREE.substring(0, 6);
                if (RREE.endsWith("0000")) {
                    RREE = AreaCode.get(ran3+2);
                    RREE = RREE.substring(0, 6) ;
                }
                return RREE;

            }

            City = City.replaceFirst("》》", "");
            City = City.replaceFirst("》", "");
            City = City.replaceFirst("《《", "");
            City = City.replaceFirst("《", "");
            City = City.replaceFirst("从", "");
            City = City.replaceFirst("货源", "");
            City = City.replaceFirst("车源", "");
            City = City.replaceFirst("编号", "");
            City = City.replaceFirst("序号", "");
            City = City.replaceFirst(":", "");
            if (City.equals("")) return "371082";

            for (int i = 0; i < ProvA.length; i++) {
                int j = City.indexOf(ProvA[i]);
                if (j >= 0) {
                    City = City.replaceFirst(ProvA[i] + "省", "");
                    City = City.replaceFirst(ProvA[i], "");
                    break;
                }
            }
            if (City.length() > 2) {
                City = City.substring(0, 2);
            }

            for (int i = 0; i < AreaCode.size(); i++) {
                String s = AreaCode.get(i);
                if  (s.indexOf("省") >0) continue;
                if  (s.indexOf("自治区") >0) continue;

                int j = s.indexOf(City);
                if (j > 0) {
                    //String RREE = s.substring(0, j - 1).trim();
                    String RREE = s.substring(0, 6).trim();
                    return RREE;

                    //return RREE.substring(0, 5) + "2";
                }
            }

            int max = AreaCode.size() - 20;
            int min = 2;
            long randomNum = System.currentTimeMillis();
            int ran3 = (int) (randomNum % (max - min) + min);

            String RREE = AreaCode.get(ran3);
            RREE = RREE.substring(0, 6);
            if (RREE.endsWith("0000")) {
                RREE = AreaCode.get(ran3+2);
                RREE = RREE.substring(0, 6) ;
            }

            return RREE;

        } catch (Exception E) {
            System.out.println("ID转换出现错误:" + E.getMessage());
            E.printStackTrace();
            return "371003";
        }
    }




    @Override
    public List<Car> setConfig() {
        if  (AreaCode.size() <=1) {
//            AreaCode=toArrayByFileReader1("E:\\工作\\T泰安\\upload_car\\src\\main\\java\\com\\cargo\\upload_car\\service\\IMP\\ereacode.txt");
            //AreaCode=toArrayByFileReader1( System.getProperty("user.dir")+"/ereacode.txt");

            AreaCode = toArrayByFileReader2("/ereacode.txt");




            //AreaCode=toArrayByFileReader1("application.yml");
        }


        //List<CarConfig> carConfigs = findCar.findAll();
        List<CarConfig> carConfigs = findCar.findTop200();
        //List<CarConfig> carConfigs = findCar.findTop1();

        List<Car> list = new ArrayList<>();
        Iterator<CarConfig> it = carConfigs.iterator();
        Car car=null;        Maxid=-1;
        while (it.hasNext()) {
            car = new Car();
            CarConfig carConfig = it.next();
            //car.setCid(carConfig.getId());
            if  (Maxid< carConfig.getId2() ) {Maxid= carConfig.getId2();}

            car.setCid( String.valueOf(IdWorker1.nextId()) );

            //System.out.println(IdWorker1.nextId0()  );
            //132636093016358921   2019-10-01  IdWorker1.nextId() 从    private final static long twepoch = 1569941203600L;  //2019-10-01
            //163438687514963969   2020-12-25 IdWorker1.nextId() 从    private final static long twepoch = 1569941203600L;  //2019-10-01
            //692886753239023617   2024-12-25  IdWorker1.nextId() 从    private final static long twepoch = 1569941203600L;  //2019-10-01



            //System.out.println(System.currentTimeMillis() );


            car.setStart_address(carConfig.getSetOutProvince() +carConfig.getSetOutCity()        );
            car.setEnd_address(carConfig.getDestinationProvince()+carConfig.getDestinationCity() );
            //car.setRemark(carConfig.getInfo());
            car.setRemark("五星级评价");

            car.setStart_id(FindCityIDReal (FindCityID(carConfig.getSetOutCity() )  )      );
            car.setEnd_id(  FindCityIDReal  (FindCityID(carConfig.getDestinationCity() ) ) );

//            car.setStart_address("山东省威海市环翠区");
//            car.setStart_address("威海");
//            //car.setStart_address("山东省临沂市");
//            car.setStart_id("371002");
//            //car.setEnd_address( "河南省开封市祥符区" );
//            car.setEnd_address( "开封" );
//            car.setEnd_id("410212");


            car.setStart_lng("116.141");
            car.setStart_lat("39.961");
            car.setEnd_lng("115.214");
            car.setEnd_lat("40.822");

            car.setIs_use_enum("0");
            car.setVip_phone ( carConfig.getPhoneNumber() );
            car.setVip_username(Username[ RandomUtil.random(5)-1]);

            //if  (! isUTF8 (car.getVip_username() ) )             System.out.println(JSON.toJSONString(car.getVip_username() + "  不是"));
     //car.setVip_username("");


            car.setCar_model(carConfig.getTType() );//车场长
            car.setCar_length(carConfig.getTLength());
/*
            车型，车长参数接口（补充）
            车型接口：http://daguolian.qdunzi.com/api/Thirdparty/getCarModel
            车长接口：http://daguolian.qdunzi.com/api/Thirdparty/getCarLength
            POST请求，以上域名均为测试域名（后期上线会更换）
            货源参数中的车型字段 car_model ，传对应车型参数id，可多选（最多三个），用,隔开（英文逗号）
            货源参数中的车长字段 car_length ，传对应车长参数id，可多选（最多三个），用,隔开（英文逗号）
*/



                car.setCar_length(Carlength[RandomUtil.random(12)-1] );//车长
            car.setCar_model(   CarModel[RandomUtil.random(10)-1] );//车型


            car.setCar_type("1");
            car.setWeight_min(String.valueOf (RandomUtil.random(3, 10) ) ) ;
            car.setWeight_max(String.valueOf (RandomUtil.random(11, 25) ) ) ;

            car.setVolume_min("");
            car.setVolume_max("");
            car.setGoods_name("普货");
            car.setStarttime(String.valueOf(new Date().getTime()/1000  ) );
            ///car.setStarttime(String.valueOf(new Date().getTime()/1000 +   loadtm[RandomUtil.random(4)-1]  ) );
            //car.setStarttime(String.valueOf(new Date()) );   这种不要的
            //car.setStarttime(DateUtil.dateToString(new Date(),"YYYY-MM-DD  hh:mm:ss"  ) );这种不要的



            car.setLoad_of("装货方式1");//装货方式
            car.setTask_price("200");
            car.setIs_visible("0");//同城是否可见
            list.add(car);

        }
        return list;
    }

    @Override
    public int  sendCars(List<Car> cars) {

        //Iterator<Car> it = cars.iterator();
        if  (cars.size() <1 )  return -1;

        SendCar sendCar = new SendCar();
        //sendCar.setRequest_id("11111");

        sendCar.setRequest_id(setRequest_id.toString());
        setRequest_id++;
        sendCar.setTimestamp(String.valueOf(new Date().getTime()));
        sendCar.setSign();
        Map<String, String> map = new LinkedHashMap<String, String>();
        //设置request_id
        map.put("request_id", Integer.toString(Integer.valueOf(sendCar.getRequest_id())));
        //设置timestamp
        map.put("timestamp", sendCar.getTimestamp());
        //设置appid
        map.put("appid", sendCar.getAppid());
        //设置签名
        map.put("sign", sendCar.getSign());
        //设置预发送json
        String Data1=JSON.toJSONString(cars);
//        map.put("data", JSON.toJSONString(cars));
//        System.out.println(JSON.toJSONString(cars));
        //log.debug(JSON.toJSONString(cars));
        String utf8Data="";
        try {
            //utf8Data = new String(Data1.getBytes("UTF-8"));
            //utf8Data= URLEncoder.encode(Data1, "UTF-8");
            utf8Data=Data1;
            map.put("data", utf8Data);
        } catch (Exception E ) {
            System.err.println(Data1 );
            map.put("data", Data1);
        }

        //System.out.println(utf8Data);
        log.debug(JSON.toJSONString(Data1));




        //String result = Send.sendPost("http://daguolian.qdunzi.com/api/thirdparty/thirdPartySource", map);
        String result = Send.sendPost("http://www.5656-5656.cn/api/thirdparty/thirdPartySource", map);
        System.err.println(result+ "上传记录"+cars.size()+ "条 要删除的小于id2="+Maxid+ " 的记录");

        return Maxid;

    }

    @Override
    public List<CarConfig> findTop200() {
        return  findCar.findTop200();
    }

    @Override
    public List<CarConfig> findTop1() {
        return  findCar.findTop1();
    }

    @Override
    public void deleteCarByCid(Integer id) {
        Integer rows = findCar.deletById(id);
    }

    @Override
    public void deletByIdless(Integer id) {
        Integer rows = findCar.deletByIdless(id);
    }
/*
    public static boolean isUTF8(String key){
        try {
            key.getBytes("utf-8");
            return true;
        } catch (UnsupportedEncodingException e) {
            return false;
        }
    }
*/


    protected static String encodeReg = "^(?:[\\x00-\\x7f]|[\\xe0-\\xef][\\x80-\\xbf]{2})+$";
    // 以下三个方法用于判断url的编码格式是utf-8或gbk

    public static String unescape(String src) {
        StringBuffer tmp = new StringBuffer();
        tmp.ensureCapacity(src.length());
        int lastPos = 0, pos = 0;
        char ch;
        while (lastPos < src.length()) {
            pos = src.indexOf("%", lastPos);
            if (pos == lastPos) {
                if (src.charAt(pos + 1) == 'u') {
                    ch = (char) Integer.parseInt(src.substring(pos + 2, pos + 6), 16);
                    tmp.append(ch);
                    lastPos = pos + 6;
                } else {
                    ch = (char) Integer.parseInt(src.substring(pos + 1, pos + 3), 16);
                    tmp.append(ch);
                    lastPos = pos + 3;
                }
            } else {
                if (pos == -1) {
                    tmp.append(src.substring(lastPos));
                    lastPos = src.length();
                } else {
                    tmp.append(src.substring(lastPos, pos));
                    lastPos = pos;
                }
            }
        }
        return tmp.toString();
    }


    public static Boolean isUTF8(String string) {
        Pattern encode_pattern = Pattern.compile(encodeReg);
        String unescaped_string = unescape(string);
        Matcher encode_matcher = encode_pattern.matcher(unescaped_string);
        if (encode_matcher.matches()) {
            return true;
        } else {
            return false;
        }
}

}
