package StrategyPattern.bad;
// for same level child classes, code duplicacy, not advisable
public class Car implements  Vehicle{
    @Override
    public void drive() {
        System.out.println("normal vehicle drive");
    }
}
