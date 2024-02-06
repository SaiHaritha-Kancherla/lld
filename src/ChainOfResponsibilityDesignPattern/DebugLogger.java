package ChainOfResponsibilityDesignPattern;

public class DebugLogger extends  Logger{
    public DebugLogger(Logger logger) {
        super(logger);
    }
    public void log(int logLevel, String message)
    {
        if(logLevel==DEBUG)
        {
            System.out.println(message);
        }
        else
        {
            this.nextLogger.log(logLevel, message);
        }
    }
}
