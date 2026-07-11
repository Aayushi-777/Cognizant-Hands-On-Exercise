public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        manager.addProduct(new Product(101, "Laptop", 10, 55000));
        manager.addProduct(new Product(102, "Keyboard", 20, 1500));
        manager.addProduct(new Product(103, "Mouse", 30, 700));
        manager.displayProducts();
        manager.updateProduct(102, "Mechanical Keyboard", 15, 2500);
        manager.displayProducts();
        manager.deleteProduct(103);
        manager.displayProducts();
    }
}
