import java.util.*;
public class PrintAlternates {
    static ArrayList<Integer> get_alternates(int[] arr){
        ArrayList<Integer> res=new ArrayList<>();
        for (int i=1; i<arr.length; i+=2){
            res.add(arr[i]);
        }
        return res;
    }
    public static void main(String args[]){
        int[] arr={10, 20, 30, 40, 50, 60, 70};
        ArrayList<Integer>res=get_alternates(arr);
        for(int num: res){
            System.out.print(num+" ");
        }
    }
    
}
