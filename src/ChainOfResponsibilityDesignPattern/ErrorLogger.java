package ChainOfResponsibilityDesignPattern;

public class ErrorLogger extends  Logger{
    public ErrorLogger(Logger logger) {
        super(logger);
    }
    public void log(int logLevel, String message)
    {
        if(logLevel==ERROR)
        {
            System.out.println(message);
        }
        else
        {
            this.nextLogger.log(logLevel, message);
        }
    }
}
