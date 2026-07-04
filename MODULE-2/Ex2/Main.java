public class Main {
    public static void main(String args[]){
        Product[] products={
            new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(104, "Bottle", "Home"),
                new Product(105, "Notebook", "Stationery")
        };
        System.out.println("LINEAR SEARCH");
        Product result=SearchOperations.linearSearch(products, "Keyboard");
        if (result!=null)
            result.display();
        else
            System.out.println("Product not found.");
        SearchOperations.sortProducts(products);
        System.out.println("BINARY SEARCH");
        result=SearchOperations.binarySearch(products, "Keyboard");
        if (result!=null)
            result.display();
        else
            System.out.println("Product not found.");
    }
}
