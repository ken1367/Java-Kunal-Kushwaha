import java.util.*;

class Patterns{
    static int i,j;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Pattern1(a);
        System.out.println();
        Pattern2(a);
        System.out.println();
        Pattern3(a);
        System.out.println();
        Pattern4(a);
        System.out.println();
        Pattern5(a);
        System.out.println();
        Pattern6(a);
    }
    static void Pattern1(int a){
        for(i=1;i<=a;i++){
            for(j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void Pattern2(int a){
        for(int i=0;i<a;i++){
            for(j=0;j<a;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void Pattern3(int a){
        for(i=a-1;i>=0;i--){
            for(j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void Pattern4(int a){
         for(i=1;i<=a;i++){
            int c=1;
            for(j=1;j<=i;j++){
                System.out.print(c++ + " ");
            }
            System.out.println();
        }
    }
    static void Pattern5(int a){
         for(i=1;i<=a;i++){
            for(j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(i=a-2;i>=0;i--){
            for(j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }  
}