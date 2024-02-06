package solidPrinciples.liskov.bad;

public interface TwoWheeler {
    public void turnOnEngine(); // not common for all child classes
    public void getPrice(); // common for all child classes
}
