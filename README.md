# logger_app

Java Spring Boot logger app. 
Generates log messages every 30s  

```
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
```
