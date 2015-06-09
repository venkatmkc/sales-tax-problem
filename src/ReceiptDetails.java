public class ReceiptDetails {
    private Items items;

    public ReceiptDetails(Items items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return items.toString() + items.formattedTotalSalesTax();
    }
}
