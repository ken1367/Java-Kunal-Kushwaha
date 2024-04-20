import java.util.*;
class QB{
    public static void main(String[] args) {
        //1.Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
       int a,b,c;
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
       // System.out.println("Max is "+isMaxMin(a,b,c,1)+" Min is "+isMaxMin(a,b,c,2));
       //2.Write a function to check if a given triplet is a Pythagorean triplet or not.
         System.out.println(isPt(a,b,c));
    }
   /*  static boolean  isPt(int a,int b,int c){
        if((a*a)+(b*b)==c*c)
         return true;
        return false;
    }*/
    /*static int isMaxMin(int a,int b,int c,int d){
        switch(d){
        case 1:{if(a>b&&a>c){
            return a;
        }
        else if(b>c&&b>a){
            return b;
        }
        else if(c>a&&c>b){
            return c;
        }
    }
    break;
    case 2:{if(a<b&&a<c){
            return a;
        }
        if(b<c&&b<a){
            return b;
        }
        if(c<a&&c<b){
            return c;
        }}
    }
   return 0;
}*/
}