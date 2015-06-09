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
}
