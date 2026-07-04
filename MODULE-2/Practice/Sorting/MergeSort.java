public class MergeSort {
    static void merge(int[] arr, int low, int mid, int high){
        int[] temp=new int[high-low+1];
        int left=low, right=mid+1;
        int k=0;
        while (left<=mid && right<=high){
            if (arr[left]<=arr[right]){
                temp[k++]=arr[left++];
            }else{
                temp[k++]=arr[right++];
            }
        }
        while (left<=mid){
            temp[k++]=arr[left++];
        }
        while (right<=high){
            temp[k++]=arr[right++];
        }
        for (int i=0; i<temp.length; i++){
            arr[low+i]=temp[i];
        }
    }
    static void merge_sort(int[] arr, int low, int high){
        if (low>=high) return;
        int mid=(low+high)/2;
        merge_sort(arr, low, mid);
        merge_sort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    public static void main(String args[]){
        int[] arr={5, 10, 65, 75, 45, 35, 67};
        merge_sort(arr, 0, arr.length-1);
        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}
