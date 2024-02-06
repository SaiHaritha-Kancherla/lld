package StrategyPattern.good;

public class NormalVehicleStrategy implements VehicleStrategy{
    @Override
    public void drive() {
        System.out.println("normal vehicle drive");
    }
}
