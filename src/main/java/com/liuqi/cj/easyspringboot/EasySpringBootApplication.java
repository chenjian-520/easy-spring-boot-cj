package com.liuqi.cj.easyspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EasySpringBootApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(EasySpringBootApplication.class);
        // Banner.mode.off 关闭
        // springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }

}
