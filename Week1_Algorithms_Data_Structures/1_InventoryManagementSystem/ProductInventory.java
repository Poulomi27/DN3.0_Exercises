import java.util.HashMap;
import java.util.Map;

public class ProductInventory {

    private Map<String, Product> products;

    public ProductInventory() {
        this.products = new HashMap<>();
    }
    private Product createProduct(String productName, int quantity, double price) {
        return new Product(productName, quantity, price);
    }
    public void addProduct(String productId, String productName, int quantity, double price) {
        if (products.containsKey(productId)) {
            System.out.println("Product with ID " + productId + " already exists.");
        } else {
            products.put(productId, createProduct(productName, quantity, price));
            System.out.println("Product added successfully.");
        }
    }
    public void updateProduct(String productId, String productName, int quantity, double price) {
        if (products.containsKey(productId)) {
            products.put(productId, createProduct(productName, quantity, price));
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product with ID " + productId + " does not exist.");
        }
    }
    public void deleteProduct(String productId) {
        if (products.containsKey(productId)) {
            products.remove(productId);
            System.out.println("Product with  productID "+ productId+ " deleted successfully.");
        } else {
            System.out.println("Product with ID " + productId + " does not exist.");
        }
    }
    public void printAllProducts() {
        if (products.isEmpty()) {
            System.out.println("No products in the inventory.");
        } else {
            for (Map.Entry<String, Product> entry : products.entrySet()) {
                System.out.println("Product ID: " + entry.getKey());
                System.out.println(entry.getValue().toString());
            }
        }
    }
    
    public static class Product {
        private final String productName;
        private final int quantity;
        private final double price;

            public Product(String productName, int quantity, double price) {
                this.productName = productName;
                this.quantity = quantity;
                this.price = price;
            }
            @Override
            public String toString() {
                return "Product:" +
                        "\nproductName='" + productName + '\'' +
                        ", \nquantity=" + quantity +
                        ", \nprice=" + price +"\n"
                        ;

            }
        }

        public static void main(String[] args) {
            ProductInventory inventory = new ProductInventory();
            
            System.out.println("Adding new products");
            inventory.addProduct("P001", "Apple Watch", 10, 299.99);
            inventory.addProduct("P002", "Samsung TV", 20, 599.99);
            System.out.println();
            
            System.out.println("Showing all products\n");
            inventory.printAllProducts();
            
            System.out.println();
            
            System.out.println("Updating product");
            inventory.updateProduct("P001", "Apple Watch Series 7", 15, 399.99);
            
            inventory.printAllProducts();
            System.out.println();
            
            System.out.println("\nDeleting product: ");
            inventory.deleteProduct("P002");

            System.out.println("\nRemaining products are: ");
            inventory.printAllProducts();
            System.out.println();
        }
}