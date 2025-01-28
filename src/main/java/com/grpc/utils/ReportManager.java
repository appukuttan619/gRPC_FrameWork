package com.grpc.utils;

//import io.cucumber.messages.types.Scenario;

import com.grpc.user_service.response.ResponseBase;
import io.cucumber.java.Scenario;
//import org.w3c.dom.Text;

public class ReportManager {
    static Scenario scenario;

    public static void initReport(Scenario scenario) {
        ReportManager.scenario = scenario;
    }

    public static void writeText(String text) {
//        scenario.attach();
//        scenario.attach(text, "plaintext", "failed");

//        scenario.log(text);
        scenario.log("testString");
//        scenario.attach("test text","text","test");

//        if (scenario != null) {
//            scenario.log(text);
//        } else {
//            System.err.println("Scenario not initialized. Unable to write text to report.");
//        }
    }

    public static void printStatus() {
        scenario.log("Status code : " + ResponseBase.statusCode);
        scenario.log("Status : " + ResponseBase.status);

        System.out.println("=-0=-0=-0=-0=-0=-0=-0=-0=-0=-0=-0Status : " + ResponseBase.status);
    }
}
