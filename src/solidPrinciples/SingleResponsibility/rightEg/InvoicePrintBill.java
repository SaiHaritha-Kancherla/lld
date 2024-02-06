package solidPrinciples.SingleResponsibility.rightEg;

public class InvoicePrintBill {
    Invoice invoice;

    public InvoicePrintBill(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printBill()
    {
        System.out.println("print bill amount ");
    }

}
