import java.util.*;
public class Leaders {
    static ArrayList<Integer> leaders(int[] arr){
        ArrayList<Integer> res=new ArrayList<>();
        int maxRight=Integer.MIN_VALUE;
        for(int i=arr.length-1; i>=0; i--){
            if (arr[i]>maxRight){
                res.add(arr[i]);
                maxRight=arr[i];
            }
        }
        Collections.reverse(res);
        return res;
    } 
    public static void main(String args[]){
        int[] arr={16, 17, 4, 3, 5, 2};
        ArrayList<Integer> res=leaders(arr);
        for (int num: res){
            System.out.print(num+" ");
        }
    }
}
