public class Item implements SalesTax{
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

    public double salesTax() {
        double salesTax = (price * 10)/100;
        salesTax *= 100;
        salesTax = Math.round(salesTax);
        salesTax /= 100;
        return salesTax;
    }
}
