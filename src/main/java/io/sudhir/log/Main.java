package io.sudhir.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        System.out.println("Hello world!");
        logger.info("This is info");
        logger.debug("This is debug");
        logger.trace("This is trace");
        logger.warn("This is warning");
        logger.error("This is an error");
        logger.fatal("This is fatal");
    }
}