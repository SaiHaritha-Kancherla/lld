package solidPrinciples.liskov.bad;

public class Cycle implements  TwoWheeler{
    @Override
    public void turnOnEngine() {
            System.out.println("no engine , no use of this method");
    }

    @Override
    public void getPrice() {

    }
}
