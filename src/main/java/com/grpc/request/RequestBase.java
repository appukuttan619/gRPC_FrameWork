package com.grpc.request;

import com.anand.grpc.UserServiceGrpc;
import com.anand.grpc.UserServiceOuterClass;
import com.grpc.utils.ConfigReader;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class RequestBase {

    public static ManagedChannel channel;
    UserServiceGrpc.UserServiceBlockingStub stub;


    public RequestBase() {
        channel = ManagedChannelBuilder.forAddress(ConfigReader.getProperty("base.url")
                        , Integer.parseInt(ConfigReader.getProperty("base.url.port")))
                .usePlaintext()
                .build();
        stub =UserServiceGrpc.newBlockingStub(channel);
    }

}

