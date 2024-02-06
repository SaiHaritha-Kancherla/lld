package StrategyPattern.good;

public class OffRoadCar extends Vehicle{
    OffRoadCar(VehicleStrategy vehicleStrategy) {
        super(vehicleStrategy);
    }
    @Override
    public void drive() {
        super.drive();
        System.out.println("inside offroardcar");
    }
}
