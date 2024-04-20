
public class Ceiling{
    public static void main(String[] args) {
      //Ceil of a number is smallest number greater than target 
       // int[] arr={1,3,5,7,9,11,15,17,19,20};
       char[] arr={'c','d','f','j'};
        char target='e';
        char ans=Ceil(arr, target);
        System.out.println(ans);
    }
    public static char Ceil(char[] arr,char target) {
        int start=0,end=arr.length-1,mid;
       while(start<=end){
        mid=start+(end-start)/2;
        if(arr[mid]<target)
          start=mid+1;
        else if(arr[mid]>target)
          end=mid-1;
        else
          return arr[mid];
       }  
       return arr[start];
      
    }
}
