public class SearchInMountain {
    public static void main(String[] args) {
       int[] array = {1,2,3,4,5,3,1};
       int target=3;
       System.out.println(Search(array, target));
    }
    public static int Search(int[] arr,int target) {
        int peak=PeakAns(arr);
        int firstTry=OrderAgsBS(arr, target, 0, peak);
        if(firstTry!=-1)
         return firstTry;
        
        return OrderAgsBS(arr, target, peak+1, arr.length-1);
    }
    public static int PeakAns(int[] arr) {
        int start=0,end=arr.length-1,mid;
        while(start<end){
            mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
              end=mid;
            else if(arr[mid]<arr[mid+1])
             start=mid+1;
            else 
             return mid;
        }
        return start;
    }
   
     public static int OrderAgsBS(int[] arr,int target,int start,int end) {
        int ans=-1;
        boolean StartInd=arr[start]<arr[end];
        while(start<=end){
        int mid=start+(end-start)/2;
         if(arr[mid]<target)
           start=mid+1;
         else if(arr[mid]>target)
           end=mid-1;
         else{
         ans=mid;
           if(StartInd)
             end=mid-1;
            else 
             start=mid+1;
        }  
    }
        return ans;
     }

}
