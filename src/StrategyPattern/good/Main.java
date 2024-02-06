package StrategyPattern.good;

public class Main {
    public static void main(String[] args)
    {
        VehicleStrategy normalVehicleStrategy=new NormalVehicleStrategy();
        VehicleStrategy sportVehicleStrategy=new SportsVehicleStrategy();
        Vehicle bike=new Bike(normalVehicleStrategy);
        Vehicle sportsVehicle=new SportsVehicle(sportVehicleStrategy);
        bike.drive();
        sportsVehicle.drive();
    }
}
