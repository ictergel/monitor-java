package com.java.monitor.grpc.client.controller;

import com.java.monitor.grpc.client.service.MonitorClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author icter
 */
@RestController
public class HelloController {

    @Autowired
    private MonitorClientService monitorClientService;

    @RequestMapping("/test")
    public String printMessage(@RequestParam(defaultValue = "Michael") String name) {
        return monitorClientService.sendMessage(name);
    }
}