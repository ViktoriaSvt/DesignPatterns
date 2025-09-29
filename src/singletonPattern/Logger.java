package singletonPattern;

import java.time.LocalDateTime;

public class Logger {
    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {

        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }

        return logger;
    }

    public void log(String message) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("logged on - " + dateTime + " " + message );
    }
}
