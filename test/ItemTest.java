import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ItemTest {
    @Test
    public void formattedItemDetailShouldBeProduced() {
        Item item = new Item(1, "music CD", 1.69);

        String actualFormattedItemDetails = item.toString();

        assertThat(actualFormattedItemDetails, is(equalTo("1 music CD : 1.69")));
    }

    @Test
    public void salesTaxShouldBeComputed() {
        Item item = new Item(1, "music CD", 1.69);

        double actualSalesTax = item.salesTax();

        assertThat(actualSalesTax, is(equalTo(0.17)));
    }

}
