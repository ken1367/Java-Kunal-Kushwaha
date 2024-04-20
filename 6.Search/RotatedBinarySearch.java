public class RotatedBinarySearch {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7,0,1,2};
       int target=0;
    System.out.println(Search(arr, target));
    }
    public static int Search(int[] arr,int target){
        int pivot=findPivot(arr);
        if(pivot==-1)
         return BinarySearch1(arr, target,0,arr.length-1);
        if(arr[pivot]==target)
         return pivot;
        if(arr[0]<=target)
         return BinarySearch1(arr, target, 0, pivot-1);
        
        return BinarySearch1(arr, target, pivot+1, arr.length-1); 
    }
    public static int BinarySearch1(int[] arr,int target,int start,int end) {
       int mid;
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
    static int findPivot(int[] arr){
        int start=0,end=arr.length-1,mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid<end&&arr[mid]>arr[mid+1])
              return mid;
            if(mid>start&&arr[mid]<arr[mid-1])
              return mid-1;
            if(arr[mid]<=arr[start])
             end=mid-1;
            else
             start=mid+1;
        }
        return -1;
    }
}
