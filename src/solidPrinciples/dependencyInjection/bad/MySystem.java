package solidPrinciples.dependencyInjection.bad;

import solidPrinciples.dependencyInjection.WiredKeyboard;
import solidPrinciples.dependencyInjection.WiredMouse;

// in future I cant upgrade my system to bluetooth one
// its always better that class depends on  interface rather than concrete class
public class MySystem {
    WiredKeyboard wiredKeyboard;
    WiredMouse wiredMouse;

    public MySystem(WiredKeyboard wiredKeyboard, WiredMouse wiredMouse) {
        this.wiredKeyboard = wiredKeyboard;
        this.wiredMouse = wiredMouse;
    }
}
