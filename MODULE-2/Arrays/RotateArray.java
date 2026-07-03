public class RotateArray {
    static void rotate_array(int[] arr, int d){
        int n=arr.length;
        d%=n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
    }  
    static void reverse(int[] arr, int low, int high){
        while (low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    public static void main(String args[]){
        int[] arr={1, 2, 3, 4, 5, 6};
        int d=2;
        rotate_array(arr, d);
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
