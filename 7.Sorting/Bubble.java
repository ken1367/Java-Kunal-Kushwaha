import java.util.*;
public class Bubble {
    public static void main(String[] args){
        int[] arr={5,3,4,1,2};
        Bubb(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubb(int[] arr){
        for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++)
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            
        }
    }
}
