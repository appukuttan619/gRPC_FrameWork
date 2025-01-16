package com.grpc.steps;

import com.grpc.request.RequestBase;
import com.grpc.utils.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Hooks {

    @Before
    public void setUp(){
        ConfigReader.initProperties();

    }

    @After
    public void tearDown(){
        RequestBase.channel.shutdown();
    }

}
