package com.liuqi.cj.easyspringboot.demo.configImplement;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author John
 * @since 2022/4/27 21:30
 * 启动后运行某些特定代码 使用 ApplicationRunner 或 CommandLineRunner @Order值越低优先级越高
 */
@Component
@Order(value = 1)
public class MyCommandLineRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("启动后运行某些特定代码 使用 ApplicationRunner 或 CommandLineRunner");
    }
}
