package org.grpc.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "src/main/resources/features",
//        glue = "com.grpc.steps"
//)

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue = "com.grpc.steps",
        plugin = "json:target/cucumber.json"

//        tags = "@Smoke"
)
public class TestRunner {
}
