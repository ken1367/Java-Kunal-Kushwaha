import java.util.*;
public class Arr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r,i,j,c=0;
        r=sc.nextInt();
        int[][] arr=new int[r][r];
        int[] brr=new int[r*r];
        for(i=0;i<r;i++){
            for(j=0;j<r;j++){
                arr[i][j]=sc.nextInt();
                brr[c++]=arr[i][j];
            }
        }
        int d=sc.nextInt();
        Arrays.sort(brr);
       System.out.println("The Kth smallest element is "+brr[d]);
//     System.out.println(Arrays.toString(brr));
        
    }
}