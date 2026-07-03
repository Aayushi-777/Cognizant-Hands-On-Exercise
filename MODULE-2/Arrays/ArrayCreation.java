public class ArrayCreation {
    public static void main(String args[]){
        int[] arr={10, 20, 30, 40};
        int n=arr.length;
        System.out.println("Integer Array:");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        String[] arr1={"Alice", "Elizabeth", "William"};
        int n1=arr1.length;
        System.out.println("String array:");
        for (int i=0; i<n1; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
