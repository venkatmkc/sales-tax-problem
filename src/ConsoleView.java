public class ConsoleView {
    private ReceiptDetails receiptDetails;
    public ConsoleView(ReceiptDetails receiptDetails) {
        this.receiptDetails = receiptDetails;
    }

    public void displayReceiptDetails() {
        System.out.println(receiptDetails);
    }
}
