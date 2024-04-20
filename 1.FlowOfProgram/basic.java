import java.util.*;
import java.lang.*;
class basic{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
 int c=2;
/*  if(a>10000)
  tot=a+2000;
 else
  tot=a+1000;
System.out.println(tot);
*/
/*String a;
 a=sc.next();
 System.out.println("Hello"+" "+a);
*/
 /*for(int i=1;i<=a;i++){
   if(a%i==0)
    c++;
 }
 if(c==2)
 System.out.println("Prime");
 else
 System.out.println("Non Prime");
*/
while(c<a){
  if(a%c==0){
  System.out.println("Not Prime");
 c++; 
}
else
System.out.println("Prime");
}
}
}
