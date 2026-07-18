package sandbox.Products.TerminalShop;

public class Product {
    private String productName;
    private int productPrice;
    private int productStock;

    public Product (String name, int price, int stock) {
        productName = name;
        productPrice = price;
        productStock = stock;
    }

    // Getters
    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public int getProductStock() {
        return productStock;
    }

    public boolean productOrder() {
        if (productStock > 0) {
            System.out.println("📦 Order Placed !");
            productStock = productStock - 1;
            return true;
        } else {
            System.out.println("Out Of Stock 📦");
            return false;
        }
    }
}



/*
The Blueprint: Product.java
This file is your encapsulated data model.
✔️ Attributes (Private): It must have a name (String), price (int), and stock (int).
✔️ The Constructor: Build the object with these three values.
✔️ Read-Only Access: Create Getters so the outside world can read the data.

The Action:
✔️ Create a method inside this blueprint (e.g., public boolean buyItem()).
✔️ If the stock is greater than 0, reduce the stock by 1 and return true (success).
✔️ If the stock is 0, print "Out of Stock" and return false. Do not let the main menu manually change the stock!
*/