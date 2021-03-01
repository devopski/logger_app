package com.apka.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableScheduling
@RestController
public class LoggingController {
    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @RequestMapping("/")
    @Scheduled(fixedRate = 30000)
    public String index() {
        logger.trace("Sample TRACE Message");
        logger.debug("Sample DEBUG Message");
        logger.info("Sample INFO Message");
        logger.warn("Sample WARN Message");
        logger.error("Sample ERROR Message");

        return "Check out the Logs to see the output...";
    }
}