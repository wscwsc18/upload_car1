package com.cargo.upload_car.util;

import java.util.Random;

/**
 * 验证码随机生成
 */
public class RandomUtil {
    public static Random random = new Random();

    public static String getRandom(int length) {
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < length; i++) {
            boolean isChar = (random.nextInt(2) % 2 == 0);// 输出字母还是数字
            if (isChar) { // 字符串
                int choice = random.nextInt(2) % 2 == 0 ? 65 : 97; // 取得大写字母还是小写字母
                ret.append((char) (choice + random.nextInt(26)));
            } else { // 数字
                ret.append(Integer.toString(random.nextInt(10)));
            }
        }
        return ret.toString().toUpperCase();
    }

    /**
     * 根据长度获取随机数组   --短信验证码
     *
     * @param length
     * @return
     */
    public static String getRandomNumber(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    /**
     * 根据指定长度随机生成大写字母
     *
     * @param length
     *            长度
     * @return 指定长度的随机大写字母字符串
     */
    public static String randomUpperWords(int length) {
		/*
		 * 0~9的ASCII为48~57 A~Z的ASCII为65~90 a~z的ASCII为97~122
		 */
        StringBuilder sb = new StringBuilder();
        Random randData = new Random();

        int data = 0;
        for (int i = 0; i < length; i++) {
            data = randData.nextInt(26) + 65;// 保证只会产生97~122之间的整数
            sb.append((char) data);
        }
        return sb.toString();
    }


    public static int  random(int min , int max ) {
    long randomNum = System.currentTimeMillis();
        int ran3 = (int) (randomNum % (max - min) + min);
        return ran3;
    }

    public static int  random( int max ) {
        int min=1;
        long randomNum = System.currentTimeMillis();
        int ran3 = (int) (randomNum % (max - min) + min);
        return ran3;
    }



    public static void main(String[] args) {
        System.out.println(RandomUtil.getRandom(3));
    }


}
