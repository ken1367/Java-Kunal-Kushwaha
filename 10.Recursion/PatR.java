import java.util.*;
public class PatR {
       public static void main(String[] args) {
        // tr1(4, 0);
        // tr2(4, 0);
        int[] arr={3,4,2,1,0,8,5,8,6,2};
        // bs(arr,arr.length-1,0);
        ss(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
       }
       static void tr1(int r,int c){
        if(r==0)
         return;
        if(c<r){
            System.out.print("*");
            tr1(r, c+1);
        }
        else{
            System.out.println();
            tr1(r-1,0);
        }
       }
       static void tr2(int r,int c){
        if(r==0)
         return;
        if(c<r){
            tr2(r, c+1);
            System.out.print("*");
        }
        else{
            tr2(r-1,0);
            System.out.println();
        }
       }
       static void bs(int[] arr,int r,int c){
        if(r==0)
         return ;
        if(c<r){
            if(arr[c]>arr[c+1]){
            int temp=arr[c];
            arr[c]=arr[c+1];
            arr[c+1]=temp;
            }
            bs(arr,r, c+1);
        }
        else{
            bs(arr,r-1,0);
        }
       }
       static void ss(int[] arr,int s,int e){
        if(s==e)
         return;
        int last=arr.length-s-1;
        int max=GetMax(arr, last);
        Swap(arr,max,last);
        ss(arr,s+1,e);
       }
       static int GetMax(int[] arr,int end){
        int i,max=0;
        for(i=0;i<=end;i++){
          if(arr[max]<arr[i])
            max=i;
        }
        return max;
      }
      static void Swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
      }
}
