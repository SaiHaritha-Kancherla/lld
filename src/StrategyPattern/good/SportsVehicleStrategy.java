package StrategyPattern.good;

public class SportsVehicleStrategy implements VehicleStrategy{
    @Override
    public void drive() {
        System.out.println(" Sports car bolthe!!");
    }
}
