package com.grpc.user_service.request;

import com.anand.grpc.UserServiceGrpc;
import com.anand.grpc.UserServiceOuterClass;
import com.grpc.utils.ChannelManager;
import com.grpc.utils.ConfigReader;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class RequestBase {

    public static ManagedChannel channel;
    UserServiceGrpc.UserServiceBlockingStub stub;


    public RequestBase() {
        channel = ChannelManager.getChannel();
//                ManagedChannelBuilder.forAddress(ConfigReader.getProperty("base.url")
//                        , Integer.parseInt(ConfigReader.getProperty("base.url.port")))
////                .enableFullStreamDecompression()
//                .usePlaintext()
//                .build();

        stub =UserServiceGrpc.newBlockingStub(channel);
    }

}

