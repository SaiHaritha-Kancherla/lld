package StrategyPattern.bad;

public class Bike implements Vehicle{
    @Override
    public void drive() {
        System.out.println("normal vehicle drive");
    }
}
