public class Item {
    private double itemPrice;
    private String itemName;
    private String itemCode;
    private int itemQuantity;

    // Constructor dengan harga, kode, nama, dan jumlah
    public Item(String code, String name, double price, int quantity) {
        this.itemCode = code;
        this.itemName = name;
        this.itemPrice = price;
        this.itemQuantity = quantity;
    }

    // Getter untuk harga, kode, nama, dan jumlah
    public double getPrice() {
        return itemPrice;
    }

    public String getCode(){
        return itemCode;
    }

    public String getName(){
        return itemName;
    }

    public int getQuantity() {
        return itemQuantity;
    }
}
