public class Sales {
    // each object contains details of one sale

    private String itemId;     // id of the item

    private double value;      // the price of one item

    private int quantity;      // the number of the items sold

    public Sales(String id, double price, int  items) {
        this.itemId = id;
        this.value = price;
        this.quantity = items;
    }
    public double getValue() {
        return value;
    }
    public int getQuantity() {
        return quantity;
    }
}
