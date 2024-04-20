import java.util.*;
public class Floor {
    public static void main(String[] args) {
        //Floor of a number means Greatest number smaller than the target.
        int[] arr={1,3,5,6};
        int target=7;
        // char[] arr={'c','d','f','j'};
        // char target='g';
        int ans=Flooro(arr, target);
        System.out.println(ans);
    }
    public static int Flooro(int[] arr,int target) {
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
       return end; 
    }
}
