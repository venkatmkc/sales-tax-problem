public class Item {
    private int quantity;
    private String name;
    private double price;

    public Item(int quantity, String name, double price) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "" + quantity + " " + name + " : " + price;
    }
}
