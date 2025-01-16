package com.grpc.config;

import com.anand.grpc.UserServiceGrpc;
import com.grpc.utils.ConfigReader;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class BaseConfig {

    ManagedChannel channel;
    UserServiceGrpc.UserServiceBlockingStub stub;

    public BaseConfig() {
        channel = ManagedChannelBuilder.forAddress(ConfigReader.getProperty("base.url")
                        , Integer.parseInt(ConfigReader.getProperty("base.url.port")))
                .usePlaintext()
                .build();
        stub =UserServiceGrpc.newBlockingStub(channel);
    }
}
