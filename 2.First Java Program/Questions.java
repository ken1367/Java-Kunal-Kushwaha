//Questions for lecture First Java Program
import java.util.*;
import java.math.*;
import javax.lang.model.util.ElementScanner14;
class Questions{
    //1.To check whetherb odd or even
   public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    //System.out.println("Enter the number to check if armstrong or not"); //Changeble based on questions
        /*int a;
        a=in.nextInt();
        if(a%2==0)
         System.out.println("Even");
        else
        System.out.println("Odd"); */ 

    //2.Take name as input and print a greeting message for that particular name.
    /* String a=in.nextLine();
   System.out.println("Hello "+a+" ,Welcome to learn Java");*/

   //3.Write a program to input principal, time, and rate (P, N, R) from the user and find Simple Interest.
  // a=in.nextInt();
  // b=in.nextInt();
  /* c=in.nextInt();
   System.out.println("The simple interest for the given P,N,R is "+(a*b*c)/100);*/
 
   //4.Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
  /*  System.out.println("Enter Characters from given (+, -, *, /)");
   char c;
   c=in.next().charAt(0);
   if(c=='+')
   System.out.println("Sum is "+(a+b));
   else if(c=='-')
   System.out.println("Diff is "+(a-b));
   else if(c=='*')
   System.out.println("Mul is "+(a*b));
   else
   System.out.println("Div is "+(a/b));*/

   //5.Take 2 numbers as input and print the largest number.
  /*  int c=(a>b)?a:b;
    System.out.println("The Largest Number is "+c);*/

    //6.Input currency in rupees and output in USD.
  //  System.out.println("The amount in Dollars"+(a*0.012));

  //7.To calculate Fibonacci Series up to n numbers.
/*   int n1=0,n2=1,n3,i;
  System.out.print(n1+","+n2);
  for(i=2;i<a;++i){
    n3=n1+n2;
    System.out.print(","+n3);
    n1=n2;
    n2=n3;*/

    //8.To find out whether the given String is Palindrome or not.
   /*String s=in.next();
   String l="";
   for(int i=(s.length()-1);i>=0;--i){
    l=l+s.charAt(i);
   }
   
  if(s.toLowerCase().equals(l.toLowerCase()))
     System.out.println("Palindrome");
  else
  System.out.println("Not Palindrome");*/
  //9.Amstrong Number
 /* int c=0,temp,rem,add=0,b;
 int a=in.nextInt();
temp=b=a;
   while(a!=0){
   c++;
   a/=10;
 }
  while(temp!=0){
    rem=temp%10;
    add+=Math.pow(rem, c);
    temp/=10;
  }
if(add==b)
System.out.println("Armstrong Number");
else
System.out.println("Not Armstrong Number");*/
}

}