public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,4,3,2};
        System.out.println(PeakAns(arr));
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
}
