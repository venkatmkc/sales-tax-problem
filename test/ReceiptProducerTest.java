import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ReceiptProducerTest {
    private final ByteArrayOutputStream outputStreamContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamContent));
    }

    @Test
    public void receiptShouldBeProduceToConsole() {
        Item itemOne = new Item(1, "music CD", 12.49);
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(itemOne);
        Items items = new Items(itemList);
        ReceiptDetails receiptDetails = new ReceiptDetails(items);
        ConsoleView consoleView = new ConsoleView(receiptDetails);
        ReceiptProducer receiptProducer = new ReceiptProducer(consoleView);

        receiptProducer.start();
        String actualReceiptProduced = outputStreamContent.toString();

        assertThat(actualReceiptProduced, is(equalTo("1 music CD : 12.49\n" +
                "Sales Taxes : 1.25\n\n")));
    }
}
