import java.util.*;
public class Selsor {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a,i;
    a=sc.nextInt();
    int[] arr=new int[a];
    for(i=0;i<a;i++)
      arr[i]=sc.nextInt();
    Selection(arr);
    System.out.println(Arrays.toString(arr));
  }
  static void Selection(int[] arr){
    for(int i=0;i<arr.length;i++){
      int end=arr.length-i-1;
      int max=GetMax(arr,end);
      Swap(arr,max,end);
    }
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