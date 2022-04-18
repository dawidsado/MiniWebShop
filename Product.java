package MiniEcommerceProject;

public class Product {
    String name;
    double price;
    String productID;
    int amount;

    public Product(String name, double price, String productID) {
        this.name = name;
        this.price = price;
        this.productID = productID;
        this.amount = 0;
    }

    public Product(String name, double price, String productID, int amount) {
        this.name = name;
        this.price = price;
        this.productID = productID;
        this.amount = amount;
    }

    public void setPrice(double price) {
        if (price < 0){
            throw new IllegalArgumentException("Price can not be negative!");
        }
        this.price = price;
    }

    public void setAmount(int amount) {
        if (amount < 0){
            throw new IllegalArgumentException("Amount can not be lower than 0!");
        }
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getProductID() {
        return productID;
    }

    public int getAmount() {
        return amount;
    }
}
