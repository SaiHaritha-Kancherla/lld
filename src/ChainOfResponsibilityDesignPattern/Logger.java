package ChainOfResponsibilityDesignPattern;

public  abstract class Logger {
    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;
    public Logger nextLogger;

    public Logger(Logger logger)
    {
        this.nextLogger=logger;
    }
    public void log(int logLevel, String message)
    {
        if(this.nextLogger!=null)
        {
            this.nextLogger.log(logLevel, message);
        }
    }

}
