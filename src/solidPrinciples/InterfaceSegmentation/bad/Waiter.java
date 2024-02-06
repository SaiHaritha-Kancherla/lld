package solidPrinciples.InterfaceSegmentation.bad;
// child classes are made to implemment methods that are not belonging to them
public class Waiter implements  RestaurantEmployee{
    @Override
    public void cook() {
        // sorry not my work
        return;
    }

    @Override
    public void serve() {

    }

    @Override
    public void getOrder() {

    }
}
