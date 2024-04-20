import java.util.*;
class BasicR{
    static int sum=0,c=0;
    public static void main(String[] args) {
        int a,b,c;
        boolean v=true;
        Scanner sc=new Scanner(System.in);
        while(v){
           System.out.println("\n------click from below to start-----\n1.Printing a number from 1 to n\n2.Print by Reversed format\n3.Factorial of a number\n4.nth Fibonacci\n5.Sum of a digit\n6.Product of a digit\n7.Reverse a number\n8.Rotate a number\n9.Count zeros in a number\n---------Click any to exit--------");
         a=sc.nextInt();
        switch(a){
            case 1:{
            System.out.println("Enter number");
            c=sc.nextInt();
            prn(c);
            // System.out.println(b);
            break;
            }
            case 2:{
            System.out.println("Enter number");
            c=sc.nextInt();
            prnrev(c);
            // System.out.println(b);
            break;
            }
            case 3:{
            System.out.println("Enter number");
            c=sc.nextInt();
            b=fact(c);
            System.out.println(b);
            break;
            }
            case 4:{
            System.out.println("Enter number");
            c=sc.nextInt();
            b=fib(c);
            System.out.println(b);
            break;
            }
            case 5:{
            System.out.println("Enter number greater than two digit");
            c=sc.nextInt();
            b=sod(c);
            System.out.println(b);
            break;
            }
            case 6:{
            System.out.println("Enter number greater than two digit");
            c=sc.nextInt();
            b=pod(c);
            System.out.println(b);
            break;
            }
            case 7:{
            System.out.println("Enter number greater than two digit");
            c=sc.nextInt();
            revn(c);
            System.out.println(sum);
            break;
            }
            case 8:{
            System.out.println("Enter number greater than two digit");
            c=sc.nextInt();
            b=rotan(c);
            System.out.println(b);
            break;
            }
            case 9:{
            System.out.println("Enter number greater than two digit");
            c=sc.nextInt();
            b=c0n(c,0);
            System.out.println(b);
            break;
            }
            default:v=false;
        }
    }
    }

    private static int fib(int a) {
        if(a==0)
         return 0;
        else if(a<=2)
         return 1;
        return fib(a-1)+fib(a-2);
    }

    private static int fact(int a) {
        if(a<=1)
         return 1;
        return a*fact(a-1);
    }

    private static void prnrev(int a) {
        if(a==0)
         return;
        prnrev(a-1);
        System.out.print(a+" ");
    }

    private static void prn(int a) {
        if(a==0)
         return;
        System.out.print(a+" ");
        prn(a-1);
    }

    private static int c0n(int a,int c) {
        if(a==0){
            return c;
        }
        int rem=a%10;
        if(rem==0){
        return c0n(a/10,c+1);
    }
    return c0n(a/10,c);
    }

    private static int rotan(int a) {
        int rem=a%10;
        int c=(int)(Math.log10(a)+1);
        return rem*(int)Math.pow(10,c-1)+(a/10);
    }

    private static void revn(int a) {
        if(a==0)
         return;
        int rem=a%10;
        sum=sum*10+rem;
        revn(a/10);
    }

    private static int pod(int n) {
        if(n%10==n)
         return n;
        return (n%10)*sod(n/10);
    }
    private static int sod(int n){
        if(n==0)
         return 0;
        return (n%10)+sod(n/10);
    }
}