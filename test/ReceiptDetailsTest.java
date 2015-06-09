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

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(items.toString()).
                thenReturn("1 music CD : 1.69\n");
        when(items.formattedTotalSalesTax()).
                thenReturn("Sales Taxes : 0.15\n");
    }

    @Test
    public void formattedReceiptDetailsShouldBeProduced() {
        ReceiptDetails receiptDetails = new ReceiptDetails(items);

        String actualFormattedReceiptDetails = receiptDetails.toString();

        assertThat(actualFormattedReceiptDetails, is(equalTo("1 music CD : 1.69\nSales Taxes : 0.15\n")));
    }
}
