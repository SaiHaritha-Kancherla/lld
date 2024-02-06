package ChainOfResponsibilityDesignPattern;

public class InfoLogger extends  Logger{
    public InfoLogger(Logger logger) {
        super(logger);
    }
    public void log(int logLevel, String message)
    {
        if(logLevel==INFO)
        {
            System.out.println(message);
        }
        else
        {
            this.nextLogger.log(logLevel, message);
        }
    }
}
