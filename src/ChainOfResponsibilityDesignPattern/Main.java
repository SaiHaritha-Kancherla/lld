package ChainOfResponsibilityDesignPattern;

public class Main {
    public  static void main(String[] args)
    {
        Logger logObject=new InfoLogger(new DebugLogger(new ErrorLogger(null)));
        logObject.log(Logger.DEBUG, "debug msg ");
        logObject.log(Logger.INFO, "info msg ");
        logObject.log(Logger.ERROR, "error msg ");
    }
}
