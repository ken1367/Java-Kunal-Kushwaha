import java.util.*;
public class Rec2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        /*int a;
        a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++)
          arr[i]=sc.nextInt();*/
        int a=0;
        int[] arr={1,3,0,0,1,2,3,6,0,9,6};
        // System.out.println(sor(arr,0));
        // System.out.println(ls(a,arr,0));
        // System.out.println(ls1(a,arr,0));
        // ArrayList<Integer> lst=new ArrayList<>();
        System.out.println(al1(arr,a,0));
    }
    static boolean sor(int[] arr,int ind){
        if(arr.length-1==ind)
         return true;
        return arr[ind]<arr[ind+1]&&sor(arr,ind+1);
    }
    static int ls(int t,int[] arr,int ind){
        if(arr.length==ind)
         return -1;
        if(arr[ind]==t)
         return ind;
        return ls(t,arr,ind+1);
    }
    static boolean ls1(int t,int[] arr,int ind){
        if(arr.length==ind)
         return false;
        if(arr[ind]==t)
         return true;
        return ls1(t,arr,ind+1);
    }
    static ArrayList<Integer> al1(int[] arr,int tar,int ind){
        ArrayList<Integer> lst=new ArrayList<>();
        if(arr.length==ind)
         return lst;
        if(arr[ind]==tar)
         lst.add(ind);
        ArrayList<Integer> ansfromBelow=al1(arr,tar,ind+1);
        lst.addAll(ansfromBelow);
        return lst;
    }

}
