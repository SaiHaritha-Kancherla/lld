package solidPrinciples.liskov.bad;

public class Bike implements  TwoWheeler{
    @Override
    public void turnOnEngine() {
            System.out.println("Engine turned on for bike");
    }

    @Override
    public void getPrice() {

    }
}
