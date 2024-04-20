import java.util.*;
public class Inssor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={5,3,1,4,2,4,1,5,7,3,4,2,8,6,10,0,11,9,9,8,4,1};
        Insertion(arr);
        System.out.print(Arrays.toString(arr));
}
    static void Insertion(int[] arr){
        int i,j;
        for(i=0;i<arr.length-1;i++){
            for(j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else
                    break;
            }
        }
    }
}