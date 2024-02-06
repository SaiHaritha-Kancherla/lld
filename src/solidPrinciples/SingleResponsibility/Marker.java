package solidPrinciples.SingleResponsibility;

public class Marker {
    int price;
    String color;
    String name;

    public Marker(int price, String color, String name) {
        this.price = price;
        this.color = color;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
