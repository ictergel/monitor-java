package com.java.monitor.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author icter
 */
@SpringBootApplication
@EnableEurekaServer
public class MonitorEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitorEurekaServerApplication.class, args);
    }
}
