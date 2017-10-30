package com.java.monitor.grpc.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author icter
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MonitorGrpcClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitorGrpcClientApplication.class, args);
    }
}
