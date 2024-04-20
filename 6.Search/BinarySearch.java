public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,11,15,17,19,20};
        int target=15;
        int ans=BinarySearch1(arr, target);
        System.out.println(ans);
    }
    public static int BinarySearch1(int[] arr,int target) {
       int start=0,end=arr.length-1,mid;
       while(start<=end){
        mid=start+(end-start)/2;
        if(arr[mid]<target)
          start=mid+1;
        else if(arr[mid]>target)
          end=mid-1;
        else
          return mid;
       }  
       return -1; 
    }
}
