public class SortOperations {
    public static void bubbleSort(Order[] orders){
        int n=orders.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; i++){
                if(orders[j].getTotalPrice()>orders[j+1].getTotalPrice()){
                    Order temp=orders[j];
                    orders[j]=orders[j+1];
                    orders[j+1]=temp;
                }
            }
        }
    }
    public static void quickSort(Order[] orders, int low, int high){
        if (low<high){
            int pivotIndex=partition(orders, low, high);
            quickSort(orders, low, pivotIndex-1);
            quickSort(orders, pivotIndex+1, high);
        }
    }
    public static int partition(Order[] orders, int low, int high){
        double pivot=orders[high].getTotalPrice();
        int i=low-1;
        for (int j=low; j<high; j++){
            if(orders[j].getTotalPrice()<=pivot){
                i++;
                Order temp=orders[i+1];
                orders[i+1]=orders[high];
                orders[high]=temp;
            }
        }
        Order temp=orders[i+1];
        orders[i+1]=orders[high];
        orders[high]=temp;
        return i+1;
    }
    public static void displayOrders(Order[] orders){
        System.out.println("OrderID\tCustomer\\tPrice");
        for (Order order:orders){
            order.display();
        }
        System.out.println();
    }
}
