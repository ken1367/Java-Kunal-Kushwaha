import java.util.*;
public class Backtrack {
    public static void main(String[] args) {
        // System.out.println(maze(3,3));
        // path("", 3, 3);
        System.out.println(pathRetD("", 3, 3));

    }
    static int maze(int r,int c){
        if(r==1||c==1)
         return 1;
        int left=maze(r-1,c);
        int right=maze(r,c-1);
        return left+right;  
    }
    static void path(String p,int r,int c){
        if(r==1&&c==1){
            System.out.println(p);
            return;
        }
        if(r>1)
         path(p+'D',r-1,c);
        if(c>1)
         path(p+'R',r,c-1);
    }
    static ArrayList<String> pathRet(String p,int r,int c){
        if(r==1&&c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(r>1)
         list.addAll(pathRet(p+'D',r-1,c));
        if(c>1)
         list.addAll(pathRet(p+'R',r,c-1));
        
        return list;
    }
    static ArrayList<String> pathRetD(String p,int r,int c){
        if(r==1&&c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(r>1 &&c>1)
         list.addAll(pathRetD(p+'D',r-1,c-1));
        if(r>1)
         list.addAll(pathRetD(p+'V',r-1,c));
        if(c>1)
         list.addAll(pathRetD(p+'H',r,c-1));
        return list;
    }
}
