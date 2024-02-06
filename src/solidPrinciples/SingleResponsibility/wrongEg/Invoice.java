package solidPrinciples.SingleResponsibility.wrongEg;

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



    // one class should have only 1 reason to change. here it has 3 reasons to change namely
    // changing way of logic saving to db : say save to db , save to file, save to harddrive
    // keep discounts, change price cal logic
    // say print bill on paper, or e-print , changing stmnts of payment receipt
    // many reasons to change a class
    // not good
    public void saveDB()
    {
        System.out.println("save to db");
    }

    public int calculate()
    {
        return marker.getPrice()*this.quantity;
    }
    public void printBill()
    {
        System.out.println("print bill amount ");
    }

}
