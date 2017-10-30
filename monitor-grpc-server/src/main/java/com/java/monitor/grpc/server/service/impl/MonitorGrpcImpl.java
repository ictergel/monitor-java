package com.java.monitor.grpc.server.service.impl;

import com.chanct.monitor.grpc.lib.MonitorGrpc;
import com.chanct.monitor.grpc.lib.MonitorReply;
import com.chanct.monitor.grpc.lib.MonitorRequest;
import io.grpc.stub.StreamObserver;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;

/**
 * @author icter
 */
@GrpcService(MonitorGrpc.class)
public class MonitorGrpcImpl extends MonitorGrpc.MonitorImplBase {

    @Override
    public void sendMsg(MonitorRequest req, StreamObserver<MonitorReply> responseObserver) {
        MonitorReply reply = MonitorReply.newBuilder().setMessage(("Hello: " + req.getName())).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
