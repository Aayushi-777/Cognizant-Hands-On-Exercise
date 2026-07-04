public class FirstAndLastOccurence {
    static int find_last(int[] arr, int x){
        int n=arr.length;
        int low=0, high=n-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                last=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return last;
    }
    static int find_first(int[] arr, int x){
        int n=arr.length;
        int low=0, high=n-1;
        int first=0;
        while(low<=high){
            int mid=(low+high)/2;
            if (arr[mid]>=x){
                first=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return first;
    }
    public static void main(String args[]){
        int[] arr={1, 3, 5, 5, 5, 5, 7, 123, 125};
        int x=5;
        int last=find_last(arr, x);
        int first=find_first(arr, x);
        System.out.println("["+first+", "+last+"]");
    }
    
}
