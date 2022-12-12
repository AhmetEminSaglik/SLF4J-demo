package org.aes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        logger.info("slf4j info");
        logger.atDebug();
        logger.warn("slf4j warn");
        logger.error("slf4j error");
    }
}