package com.cargo.upload_car.service;

import com.cargo.upload_car.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
@Configurable
@EnableScheduling
//@Log4j
public class ScheduledTasks {
	@Autowired
	public IfiandID ifiandID;

	//@Autowired
	//public DemoService demoService;

	private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

	public ScheduledTasks(){
	}



	/**
	 *  * 凌晨清表
	 */
	@Scheduled(cron = "0 0 23 * * ?")
	public void truncate(){
		try{
				//infomasterMapper.truncate();

		}catch(Exception ex){
			System.out.println(":"+ex.getMessage());
		}finally{

		}

	}

	/**
	 * 扫描货源同步并删除源数据
	 */
	@Scheduled(fixedDelay = 1000 * 11)
	private void ScanandDelete200() {
		 int maxid=-1;

		 String  Hour=DateUtil.getHour(new Date() );
		 if  ( (Hour.compareTo("19")>0 )  || (Hour.compareTo("07") <0 )  ){ return ;}


			///try {

		//demoService.deleteById(15);

					maxid=ifiandID.sendCars(ifiandID.setConfig());
					if  (maxid >=0)  {ifiandID.deletByIdless( maxid);}
					//System.out.println("信息扫描正常:");
//			} catch (Exception ex) {
//					System.out.println("信息扫描异常:" + ex.getMessage());
//					log.error("信息扫描异常:"+ex.getMessage()+"======");
//					ex.printStackTrace();
//			}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



//慢慢已经改动啦
