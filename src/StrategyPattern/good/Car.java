package StrategyPattern.good;

public class Car extends Vehicle{
    Car(VehicleStrategy vehicleStrategy) {
        super(vehicleStrategy);
    }
    @Override
    public void drive() {
        super.drive();
        System.out.println("inside car");
    }
}
