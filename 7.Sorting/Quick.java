import java.util.*;
public class Quick {
    public static void main(String[] args){
        int[] arr={5,4,3,2,1};
        sort(arr,0,arr.length-1);

        // Arrays.sort(); It is an internal implementation of quick sort It's complexity is O(nlogn)

        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int low,int hi){
        if(low>=hi)
         return;
        int s=low,e=hi;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        sort(arr,low,e);
        sort(arr,s,hi);
    }
}
