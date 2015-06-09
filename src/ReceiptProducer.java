public class ReceiptProducer {
    ConsoleView consoleView;

    public ReceiptProducer(ConsoleView consoleView) {
        this.consoleView = consoleView;
    }

    public void start() {
        consoleView.displayReceiptDetails();
    }
}
