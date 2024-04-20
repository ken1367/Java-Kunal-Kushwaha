import java.util.*;
public class OrderAgsBS {
    public static void main(String[] args) {
         int[] arr={5,7,7,8,8,10};
         int target=8;
         int[] ans=SearchRange(arr, target);
         System.out.print(Arrays.toString(ans));
    }
    public static int[] SearchRange(int[] arr,int target) {
        int[] ans={-1,-1};
       
        ans[0]=OrderAgsBS1(arr, target,true);
        if(ans[0]!=-1)
         ans[1]=OrderAgsBS1(arr, target,false);

        return ans;
        }  
     public static int OrderAgsBS1(int[] arr,int target,boolean StartInd) {
        int ans=-1;
        int start=0,end=arr.length-1,mid;
        
        while(start<=end){
         mid=start+(end-start)/2;
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
