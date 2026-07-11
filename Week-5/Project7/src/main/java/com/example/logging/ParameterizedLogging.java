package com.example.logging;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class ParameterizedLogging {
    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLogging.class);
    public static void main(String[] args) {
        String name = "Aayushi";
        int age = 21;
        logger.info("Name : {}", name);
        logger.info("Age : {}", age);
        logger.info("{} is {} years old.", name, age);
    }
}