package com.grpc.hooks;

import com.grpc.utils.ChannelManager;
import com.grpc.utils.ConfigReader;
import com.grpc.utils.ReportManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void setUp(Scenario scenario){
        ConfigReader.initProperties();
        ChannelManager.initChannel();
        ReportManager.initReport(scenario);

    }

    @After
    public void tearDown(Scenario scenario){
        ChannelManager.closeChannel();
//        ReportManager.writeText("statusCode :" + 3);
        ReportManager.printStatus();
    }

}
