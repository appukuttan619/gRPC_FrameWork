package com.grpc.utils;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ChannelManager {

    private static ManagedChannel channel;

    public static void initChannel(){
        channel = ManagedChannelBuilder.forAddress(
                        ConfigReader.getProperty("base.url"),Integer.parseInt(ConfigReader.getProperty("base.url.port"))
                )
                .usePlaintext()
                .build();
    }

    public static ManagedChannel getChannel(){
        return channel;
    }

    public static void closeChannel(){
        channel.shutdown();
    }
}
