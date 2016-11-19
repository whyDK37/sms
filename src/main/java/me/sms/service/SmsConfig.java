package me.sms.service;

/**
 * Created by why on 11/19/2016.
 */
public class SmsConfig {
    private static String[] mobile = new String[]{"18600164540"};

    public static String[] getMobile() {
        return mobile;
    }

    public static void setMobile(String[] mobile) {
        SmsConfig.mobile = mobile;
    }
}
