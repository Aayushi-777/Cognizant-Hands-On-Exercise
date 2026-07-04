public class QuickSort {
    static void quick_sort(int[] arr, int low, int high){
        if (low<high){
            int pivot=partition(arr, low, high);
            quick_sort(arr, low, pivot-1);
            quick_sort(arr, pivot+1, high);
        }
    }
    static int partition(int[] arr, int low, int high){
        int pivot=arr[high];
        int i=low-1;
        for (int j=low; j<high; j++){
            if (arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp1=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp1;
        return i+1;
    }
    public static void main(String args[]){
        int[] arr={5, 10, 65, 75, 45, 35, 67};
        quick_sort(arr, 0, arr.length-1);
        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}
