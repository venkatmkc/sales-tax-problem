public class ReceiptDetails {
    private Items items;
    private SalesTax salesTax;
    private Total total;

    public ReceiptDetails(Items items, SalesTax salesTax, Total total) {
        this.items = items;
        this.salesTax = salesTax;
        this.total = total;
    }

    @Override
    public String toString() {
        return items.toString() + "\n" + salesTax.toString() + "\n" + total.toString();
    }
}
