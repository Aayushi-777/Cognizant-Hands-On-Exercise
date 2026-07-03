public class MoveZeroesToEnd {
    static int[] move_zeroes_to_end(int[] arr){
        int n=arr.length;
        int j=0;
        for (int i=0; i<n; i++){
            if (arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }
    public static void main(String args[]){
        int[] arr={1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        arr=move_zeroes_to_end(arr);
        for (int num: arr){
            System.out.print(num+" ");
        }
    }
    
}
