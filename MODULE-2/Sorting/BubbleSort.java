public class BubbleSort {
    static void bubble_sort(int[] arr){
        int n=arr.length;
        int temp;
        for(int i=n-1; i>=0; i--){
            for (int j=0; j<i; j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int num: arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String args[]){
        int[] arr={5, 10, 65, 75, 45, 35, 67};
        bubble_sort(arr);
    } 
}
