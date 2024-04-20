import java.util.ArrayList;

public class DiceA {
    public static void main(String[] args){
        System.out.println(dc("",4));
    }
    static ArrayList<String> dc(String p,int up){
        if(up==0){
            ArrayList<String> ap=new ArrayList<>();
            ap.add(p);
            return ap;
        }
        ArrayList<String> al=new ArrayList<>();
        for(int i=1;i<=6&&i<=up;i++){
            al.addAll(dc(p+i,up-i));
        }
        return al;
    }
}
