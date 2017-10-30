package com.java.monitor.grpc.client.service;

import com.chanct.monitor.grpc.lib.MonitorGrpc;
import com.chanct.monitor.grpc.lib.MonitorReply;
import com.chanct.monitor.grpc.lib.MonitorRequest;
import io.grpc.Channel;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.stereotype.Service;


/**
 * @author icter
 */
@Service
public class MonitorClientService {

    @GrpcClient("monitor-grpc-server")
    private Channel serverChannel = null;

    public String sendMessage(String name) {
        MonitorGrpc.MonitorBlockingStub stub = MonitorGrpc.newBlockingStub(serverChannel);
        MonitorReply response = stub.sendMsg(MonitorRequest.newBuilder().setName(name).build());
        return response.getMessage();
    }
}