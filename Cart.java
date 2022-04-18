package MiniEcommerceProject;

import java.util.ArrayList;

public class Cart {
    ArrayList<Product> productsList = new ArrayList<>();
    User user;

    // Simulation of empty cart in the shop
    public Cart() {
    }

    //User is taking the cart
    public Cart(User user) {
        this.user = user;
    }

    //User with some products in hands is taking the cart
    public Cart(ArrayList<Product> productsList, User user) {
        this.productsList = productsList;
        this.user = user;
    }

    void addProduct(Product product) {
        int i = 0;
        for (Product p : productsList) {
            p.amount -= 1;
            i++;
            if (i > p.amount) {
                throw new IllegalArgumentException("Error, there are not enough products in stock");
            }
        }
        productsList.add(product);
    }

    void removeProduct(Product product){
        productsList.remove(product);
    }

    void payment(){
        double price = 0;
        for (Product p : productsList){
            price += p.price;
        }
        System.out.println("The final price is: " + price);
    }
}
