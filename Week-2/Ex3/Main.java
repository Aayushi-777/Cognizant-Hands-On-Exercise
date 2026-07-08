public class Main {
    public static void main(String[] args) {
        Order[] orders={
                new Order(101, "Aayushi", 4500),
                new Order(102, "Rahul", 2200),
                new Order(103, "Sneha", 8500),
                new Order(104, "Rohan", 3100),
                new Order(105, "Priya", 1500)
        };
        System.out.println("Original Orders");
        SortOperations.displayOrders(orders);
        SortOperations.bubbleSort(orders);
        System.out.println("After Bubble Sort");
        SortOperations.displayOrders(orders);
        Order[] orders2={
                new Order(101, "Aayushi", 4500),
                new Order(102, "Rahul", 2200),
                new Order(103, "Sneha", 8500),
                new Order(104, "Rohan", 3100),
                new Order(105, "Priya", 1500)
        };
        SortOperations.quickSort(orders2, 0, orders2.length - 1);
        System.out.println("After Quick Sort");
        SortOperations.displayOrders(orders2);
    }
}
