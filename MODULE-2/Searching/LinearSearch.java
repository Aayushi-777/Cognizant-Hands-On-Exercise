public class LinearSearch{
    static int linear_search(int[] arr, int target){
        int n=arr.length;
        for (int i=0; i<n; i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr={2, 4, 6, 8, 9, 10};
        int target=9;
        int ans=linear_search(arr, target);
        System.out.println("The target is at index "+ans+" in the array.");
    }
}