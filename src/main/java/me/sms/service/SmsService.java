package me.sms.service;

import me.sms.service.bomb.AiQianJinBomb;
import me.sms.service.bomb.BombSms;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.Lifecycle;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by why on 11/19/2016.
 */
@Component
public class SmsService {
    Logger logger = LoggerFactory.getLogger(SmsService.class);

    static List<BombSms> bomb = new ArrayList<BombSms>();
    static {
        bomb.add(new AiQianJinBomb());
    }
    public SmsService(){
        System.out.println("init sms service");
    }

//    @Scheduled(cron = "0/3 * * * * ?")
    @Scheduled(fixedRate = 5000)
    public void execute() {
        for (String s : SmsConfig.getMobile()) {
            logger.info("bomb mobile:{}", s);
            for (BombSms bombSms : bomb) {
                bombSms.bomb(s);
            }
        }
    }
}
