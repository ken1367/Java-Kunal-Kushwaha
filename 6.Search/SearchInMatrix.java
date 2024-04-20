import java.util.*;

public class SearchInMatrix {
    public static void main(String[] args) {
       int arr[][]={{10,20,30,40},
    {15,25,35,45},{28,29,37,49},{33,34,38,50}};
        System.out.println(Arrays.toString(Search(arr, 37)));
        
    }
    public static int[] Search(int[][] mat,int target){
        int c=mat.length-1,r=0;
        while(r<mat.length&&c>=0){
            if(mat[r][c]==target)
             return new int[]{r,c};
            if(mat[r][c]>target)
             c--;
            else
             r++;
        }
        return new int[]{-1,-1};
    }   
}
