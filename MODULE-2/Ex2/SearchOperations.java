import java.util.*;
public class SearchOperations {
    public static Product linearSearch(Product[] products, String name){
        for(Product product:products){
            if(product.getProductName().equalsIgnoreCase(name)){
                return product;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products, String name){
        int low=0;
        int high=products.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            int compare=products[mid].getProductName().compareToIgnoreCase(name);
            if (compare==0){
                return products[mid];
            }
            else if(compare<0){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return null;
    }
        public static void sortProducts(Product[] products){
            Arrays.sort(products, Comparator.comparing(Product::getProductName, String.CASE_INSENSITIVE_ORDER));
        }
}
