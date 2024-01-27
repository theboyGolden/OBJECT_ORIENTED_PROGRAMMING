// Task: Inventory Management System
// Class Definitions:
// Product Class:

// Properties:
// productId (String)
// productName (String)
// unitPrice (double)
// quantityInStock (int)
// Methods:
// getProductId(): String - returns the product ID.
// getProductName(): String - returns the product name.
// getUnitPrice(): double - returns the unit price of the product.
// getQuantityInStock(): int - returns the quantity of the product in stock.
// updateStock(int quantity): void - updates the stock of the product based on sales or restocking.
// ShoppingCart Class:

// Properties:
// items (Map of Product to Integer)
// Methods:
// addItem(Product product, int quantity): void - adds a product with the specified quantity to the shopping cart.
// removeItem(Product product, int quantity): void - removes a specified quantity of a product from the shopping cart.
// calculateTotal(): double - calculates the total cost of items in the shopping cart.
// OnlineStore Class:

// Properties:
// inventory (List of Product)
// Methods:
// addToInventory(Product product): void - adds a product to the store's inventory.
// displayInventory(): void - displays the current inventory.
// processOrder(ShoppingCart cart): void - processes an order by updating the inventory and displaying the receipt.
// Requirements:
// Create the Product class with the specified properties and methods.
// Create the ShoppingCart class with the specified properties and methods.
// Create the OnlineStore class with the specified properties and methods.
// Implement the necessary methods to manage inventory, add items to the shopping cart, remove items, calculate the total cost, and process orders.
// Write a Main class that demonstrates the usage of these classes. Create instances of OnlineStore, add products to the inventory, display the inventory, simulate customer shopping, and process orders.


public Class Product {
    private String productId;
    private String productName;
    private double unitPrice;
    private int quantityInStock;


    getProductId () {
        return this.productId;
    }

    getProductName (){
        return this.productName;
    }

    getUnitPrice () {
        return this.unitPrice;
    }

    getQuantityInStock () {
        return this.quantityInStock;
    }

    void updateStock (int quantity) {
        if (this.quantityInStock + quantity < 0) throw new IllegalArgument
        Exception("Cannot have negative stock amount");
        this.quantityInStock += quantity;

    }
}


public Class ShoppingCart {
    private Map<String, Integer> itemMap = new HashMap<>();
    addItem(Product p, int quantity) {
        itemMap.putIfAbsent(p.getProductId(), quantity);
        itemMap.replace(p.getProductId(), itemMap.get(p.getProductId()) + quantity);
    
    }

    removeItem (Product product, int quantity){
        Integer currentQuantity = itemMap.get(product.getProductId());
        if (currentQuantity == null || quantity > currentQuantity) throw new
        IllegalStateException("Not enough items in cart to fulfill request");
        itemMap.replace(product.getProductId(), currentQuantity - quantity);
        if (itemMap.get(product.getProductId()) == 0) itemMap
        .remove(product.getProductId());
        
    }

}

public Class OnlineStore {
    inventory 
    public Product getProduct(String id) throws ProductNotFoundException{
        // code to retrieve a product from the database given an ID
    }
}