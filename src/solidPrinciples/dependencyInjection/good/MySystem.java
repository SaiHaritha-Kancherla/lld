package solidPrinciples.dependencyInjection.good;
import solidPrinciples.dependencyInjection.Keyboard;
import solidPrinciples.dependencyInjection.Mouse;

public class MySystem {
    Keyboard keyboard;
    Mouse mouse;
    public MySystem(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}
