public class InfiniteArray {
    
    public static void main(String[] args) {
        int[] arr={2,3,5,6,7,8,10,11,12,15,20,23,30};
        int target=30;
        System.out.println(ans(arr, target));
    }
    public static int ans(int[] arr,int target) {
        int start=0,end=1,temp;
        while(target>arr[end]){
         temp=end+1;
         end=end+(end-start+1)*2;
         start=temp;
    }
    return BinarySearch1(arr, target, start, end);
}
    public static int BinarySearch1(int[] arr,int target,int start,int end) {
        int mid,ans=-1;
        while(start<=end){
         mid=start+(end-start)/2;
         if(arr[mid]<target)
           start=mid+1;
         else if(arr[mid]>target)
           end=mid-1;
         else
           return mid;
        }  
        return ans; 
     }
}
