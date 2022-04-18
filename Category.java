package MiniEcommerceProject;

import java.util.ArrayList;

public class Category {
    String name;
    ArrayList<Product> productsList = new ArrayList<>();

    //Main category, without any data
    public Category() {}

    //New empty cat. with particular name
    public Category(String name) {
        this.name = name;
    }

    public Category(String name, ArrayList<Product> productsList) {
        this.name = name;
        this.productsList = productsList;
    }

    public void setName(String name) {
        this.name = name;
    }

    void  addProduct(Product product){
        productsList.add(product);
    }

    void removeProduct(Product product){
        productsList.remove(product);
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", productsList=" + productsList +
                '}';
    }
}
