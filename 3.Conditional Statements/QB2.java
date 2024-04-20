import java.util.*;
import java.math.*;
class QB2{
    public static void main(String args[]){
        //1.Fibonacci Series
        long b=1,d,rem,rev=0,sum=0,rev1=0;
        int i;
        Scanner in=new Scanner(System.in);
         d=in.nextLong();
      /*  System.out.print(a+" "+b+" ");
        for(i=1;i<=d;i++){
           c=a+b;
           System.out.print(c+" ");
           a=b;
           b=c;
        }*/
        //2.Input a number and print all the factors of that number
        /*for(i=1;i<=d;i++){
          if(d%i==0)
           System.out.print(i+" ");
        }*/
        //3.Take integer inputs till the user enters 0 and print the sum of all numbers
     /*   long[] a=new long[100];
         while(d!=0){
          rem=d%10;
          rev=rev*10+rem;
          d/=10;
         }
         
         while(rev%10!=0){//05 1
           rem=rev%10;
           rev1=rev1*10+rem;
           rev/=10;
         }
         int i=0,j; 
         while(rev1!=0){
          a[i]=rev1%10;
          rev1/=10;
          i++;
         }
         int k=a.length;
         for(i=0;i<a.length;i++){
           long temp;
          for(j=i+1;j<a.length;j++){
            if(a[i]>a[j]){
              temp=a[i];
              a[i]=a[j];
              a[j]=temp;
            }
          }
         }
         System.out.println(a[k-1]);*/
        /* for(i=1;i<=d;i++){
          b*=i;
          sum+=i;
         }
        // System.out.println("The Factorial of number is "+b);
         System.out.println("The Sum of N number is "+sum);
         }*/
         //3.Reverse a string in java
      /*    String a=in.next();
         String e="";
         for(i=(a.length()-1);i>=0;--i){
          e=e+a.charAt(i);
         }
         System.out.println("The reversed String is "+e);*/
      //4.Number Palindrome
     long temp=d;
     long temp2=d;
       /*  while(d!=0){
          rem=d%10;
          rev=rev*10+rem;
          d/=10;
        }
        if(rev==temp)
        System.out.println("Palindrome");
        else
        System.out.println("Not a Palindrome");*/
      
      //5.Armstrong number
       /* int c=0;
        while(d!=0){
          d/=10;
          c++;
        }
        while(temp!=0){
          rem=temp%10;
          sum+=Math.pow(rem,c);
          temp/=10;
        }
        if(temp2==sum)
         System.out.println("Armstrong Number");
        else
         System.out.println("Not an Armstrong Number");*/
    }
  }
