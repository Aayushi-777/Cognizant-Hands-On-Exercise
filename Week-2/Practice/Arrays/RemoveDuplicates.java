import java.util.*;
public class RemoveDuplicates {
    static int remove_duplicates(int[] arr){
        int n=arr.length;
        HashSet<Integer> hs=new HashSet<>();
        int idx=0;
        for (int i=0; i<n; i++){
            if (!hs.contains(arr[i])){
                hs.add(arr[i]);
                arr[idx++]=arr[i];
            }
        }
        return idx;
    }
    public static void main(String args[]){
        int[] arr={1, 2, 2, 3, 4, 4, 4, 5, 5};
        int idx=remove_duplicates(arr);
        for(int i=0; i<idx; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
