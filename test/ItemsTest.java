import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class ItemsTest {
    @Mock
    private Item itemOne, itemTwo;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(itemOne.toString()).
                thenReturn("item one");
        when(itemTwo.toString()).
                thenReturn("item two");
        when(itemOne.salesTax())
                .thenReturn(1.25);
        when(itemTwo.salesTax())
                .thenReturn(0.50);
        when(itemOne.getPrice()).
                thenReturn(12.49);
    }

    @Test
    public void formattedItemListShouldBeProduced() {
        ArrayList<Item> itemList = new ArrayList<Item>();
        itemList.add(itemOne);
        itemList.add(itemTwo);
        Items items = new Items(itemList);

        String actualFormattedItemList = items.toString();

        assertThat(actualFormattedItemList, is(equalTo("item one\nitem two\n")));
    }

    @Test
    public void totalSalesTaxShouldBeCalculated() {
        ArrayList<Item> itemList = new ArrayList<Item>();
        itemList.add(itemOne);
        itemList.add(itemTwo);
        Items items = new Items(itemList);

        double actualSalesTaxtotal = items.totalSalesTax();

        assertThat(actualSalesTaxtotal, is(equalTo(1.75)));
    }

    @Test
    public void totalAmountShouldBeCalculated() {
        ArrayList<Item> itemList = new ArrayList<Item>();
        itemList.add(itemOne);
        Items items = new Items(itemList);

        double actualTotalAmount = items.totalAmount();

        assertThat(actualTotalAmount, is(equalTo(13.74)));
    }
}