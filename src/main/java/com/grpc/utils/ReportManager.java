package com.grpc.utils;

import io.cucumber.java.Scenario;
import org.w3c.dom.Text;

public class ReportManager {
    static Scenario scenario;

    public static void initReport(Scenario scenario){
        ReportManager.scenario = scenario;
    }

    public static void writeText(String text){
//        scenario.attach();
//        scenario.attach(text, "plaintext", "failed");

//        scenario.log(text);
        scenario.log("<span style='color:blue'>" + text + "</span>");

//        if (scenario != null) {
//            scenario.log(text);
//        } else {
//            System.err.println("Scenario not initialized. Unable to write text to report.");
//        }

    }
}
