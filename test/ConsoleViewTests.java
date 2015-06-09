import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

public class ConsoleViewTests {
    private final ByteArrayOutputStream outputStreamContent = new ByteArrayOutputStream();

    @Mock
    private Items items;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(items.toString()).thenReturn("item details");
        System.setOut(new PrintStream(outputStreamContent));
    }

    @Test
    public void receiptShouldBeDisplayed() {
        ReceiptDetails receiptDetails = new ReceiptDetails(items);
        ConsoleView consoleView = new ConsoleView(receiptDetails);

        consoleView.displayReceiptDetails();
        String actualReceipt = outputStreamContent.toString();

        assertThat(actualReceipt, is(equalTo("item details\n\n")));
    }
}
