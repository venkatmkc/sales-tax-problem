import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

public class ReceiptDetailsTest {
    @Mock
    private Items items;

    @Mock
    private SalesTax salesTax;

    @Mock
    private Total total;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(items.toString()).
                thenReturn("1 music CD : 1.69");
        when(salesTax.toString()).
                thenReturn("Sales Taxes : 0.15");
        when(total.toString()).
                thenReturn("Total : 1.84");
    }

    @Test
    public void formattedReceiptDetailsShouldBeProduced() {
        ReceiptDetails receiptDetails = new ReceiptDetails(items, salesTax, total);

        String actualFormattedReceiptDetails = receiptDetails.toString();

        assertThat(actualFormattedReceiptDetails, is(equalTo("1 music CD : 1.69\nSales Taxes : 0.15\nTotal : 1.84")));
    }
}
