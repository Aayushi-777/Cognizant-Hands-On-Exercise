public class ReverseArray {
    static int[] reverse_array(int[] arr){
        int n=arr.length;
        int[] temp=new int[n];
        for (int i=0; i<n; i++){
            temp[i]=arr[n-i-1];
        }
        return temp;
    }
    public static void main(String args[]){
        int[] arr={1, 2, 3, 4, 5, 6, 7};
        int[] res=reverse_array(arr);
        for(int num: res){
            System.out.print(num+" ");
        }
    }
}
