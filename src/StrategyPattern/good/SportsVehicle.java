package StrategyPattern.good;

public class SportsVehicle extends  Vehicle{
    SportsVehicle(VehicleStrategy vehicleStrategy) {
        super(vehicleStrategy);
    }
    @Override
    public void drive() {
        super.drive();
        System.out.println("inside sportsvehicle");
    }
}
