package com.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Slf4jLearn {

    private static Logger logger =
            LoggerFactory.getLogger(Slf4jLearn.class);

    public static void main(String[] args){
        logger.debug("Debug");
        logger.info("Info");
        logger.warn("Warn");
        logger.error("Error");
    }

}
