package solidPrinciples.SingleResponsibility.rightEg;

import solidPrinciples.SingleResponsibility.Marker;

public class Invoice {

    Marker marker; //has a relation
    int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public Marker getMarker() {
        return marker;
    }

    public void setMarker(Marker marker) {
        this.marker = marker;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public int calculate()
    {
        return marker.getPrice()*this.quantity;
    }

}
