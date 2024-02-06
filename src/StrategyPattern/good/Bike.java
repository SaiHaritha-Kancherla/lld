package StrategyPattern.good;

public class Bike extends Vehicle{
    Bike(VehicleStrategy vehicleStrategy) {
        super(vehicleStrategy);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("inside bike");
    }
}
