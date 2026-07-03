public class SquareRoot {
    static int square_root(int n){
        int low=0, high=n-1;
        int res=1;
        while(low<=high){
            int mid=(low+high)/2;
            if (mid*mid<=n){
                res=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return res;
    }
    public static void main(String args[]){
        int n=25;
        int sq_root=square_root(n);
        System.out.println("The square root of "+n+" is: "+sq_root);
    }
    
}
