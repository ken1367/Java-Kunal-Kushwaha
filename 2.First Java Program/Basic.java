import java.util.Scanner;

public class Basic {
    public static void main(String[] args){
        float a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        float faren= (float)(a*1.8)+32;
        System.out.println(faren);

    }
}
