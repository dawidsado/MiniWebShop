package MiniEcommerceProject;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //Two guest accounts
        User g1 = new User("guest1@gmail.com");
        User g2 = new User("guest2@gmail.com");

        //One normal account
        User u1 = new User("Dawid", "Sadownik", "user1@gmail.com", "XYZpassword");
        u1.setAge(2002);

        //Create user account from guest acc.
        g1.changeStatus("John", "Kowalski", "John_passsowrd");

        //Printing info about John account
        System.out.println(g1);

        //Three products
        Product p1 = new Product("Apple", 3.00, "APPLE2013Z");
        Product p2 = new Product("Pizza_slice", 8.50, "PIZZASLICE2098X", 1);
        Product p3 = new Product("Orange_juice", 4.00, "ORANGEJUICE4038Y",5);

        //Change price in one of them
        p2.setPrice(7.00);

        //Set the amount at five
        p2.setAmount(8);

        //Create three categories using different constructors and add to each of them one created product (we will need an ArrayList)
        ArrayList<Product> products = new ArrayList<>();

        Category c1 = new Category();
        c1.addProduct(p1);

        Category c2 = new Category("Second_category", products);
        products.add(p2);

        Category c3 = new Category("Third_category");
        c3.addProduct(p3);

        //Create cart in three ways
        products.add(p2);
        Cart cart1 = new Cart();

        Cart cart2 = new Cart(u1);

        Cart cart3 = new Cart(products, g1);

        //Add two products into two carts, inside one of them delete product, finalize with payment
        cart1.addProduct(p2);
        cart1.addProduct(p2);
        cart3.addProduct(p3);
        cart3.addProduct(p2);

        cart1.removeProduct(p2);
        cart1.payment();




    }
}
