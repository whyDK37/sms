package me.sms;

import me.sms.service.SmsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
//@ComponentScan("me.sms")
public class DemoApplication {

	public static void main(String[] args) {
//		if(args.length>0){
//			SmsConfig.setMobile(args);
//		}
		SpringApplication.run(DemoApplication.class, args);
		System.out.println(SpringApplication.BANNER_LOCATION_PROPERTY);
	}

}
