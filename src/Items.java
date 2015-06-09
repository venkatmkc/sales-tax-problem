import java.util.ArrayList;

public class Items {
    private ArrayList<Item> itemList;

    public Items(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        String formattedItemList = new String();
        for (Item item : itemList) {
            formattedItemList += item.toString() + "\n";
        }
        return formattedItemList;
    }

    public double totalSalesTax() {
        double totalSalesTax = 0;
        for(Item item : itemList)
            totalSalesTax += item.salesTax();
        return  totalSalesTax;
    }

    public double totalAmount() {
        double totalAmount = 0;
        for(Item item : itemList) {
            totalAmount += item.getPrice();
            totalAmount += item.salesTax();
        }
        return totalAmount;
    }
}
