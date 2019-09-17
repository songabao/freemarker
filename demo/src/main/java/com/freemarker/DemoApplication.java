package com.freemarker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {
		log.info("第一个添加接口是："+"\n"+"http://localhost:8902/simple?name=***&age=21&sex=男&tel=****&email=***&address=****");
		log.info("第二个查看接口是："+"\n"+"http://localhost:8902/list");
		SpringApplication.run(DemoApplication.class, args);
	}

}
