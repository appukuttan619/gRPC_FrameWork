package com.grpc.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    // making the variables and methods static so that it can be accessed without the need of an object

    static Properties properties;

    // initialising the property file
    public static void initProperties(){
        properties = new Properties();

        try {
            properties.load(new FileInputStream("src/main/resources/config/config.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Returning the corresponding value based on a key
    public static String getProperty(String key){
        return properties.getProperty(key);
    }

}
