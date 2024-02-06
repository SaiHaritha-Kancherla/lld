package solidPrinciples.SingleResponsibility.rightEg;

public class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveDB()
    {
        System.out.println("save to db");
    }
}
