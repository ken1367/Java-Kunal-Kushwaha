import java.lang.*;
import java.util.*;
public class QB1{
    public static void main(String[] args) {
        float a,pi=3.14f,r,b,h,l,b1,diag1,diag2;
        int option;
        Scanner in=new Scanner(System.in); 
        do{
        System.out.print("Enter 1.Area of circle\n 2.Area Of Rectangle\n 3.Area Of Isosceles Triangle\n 4.Area Of Parallelogram\n 5.Area Of Rhombus\n ");
        System.out.print("6. Area Of Equilateral Triangle\n 7. Perimeter Of Circle\n 8.Perimeter Of Equilateral Triangle\n 9. Perimeter Of Parallelogram\n 10.Perimeter Of Rectangle\n ");
        System.out.print("11. Perimeter Of Square\n 12. Perimeter Of Rhombus\n 13. Volume Of Cone\n 14. Volume Of Prism\n 15. Volume Of Cylinder\n ");
        System.out.print("16. Volume Of Sphere\n 17. Volume Of Pyramid\n 18. Curved Surface Area Of Cylinder\n 19. Total Surface Area Of Cube\n ");
         option=in.nextInt();
        switch(option){
            case 1:{System.out.println("Enter Radius");
             r=in.nextFloat();
             System.out.println("Area of circle is "+ pi*r*r);
             break;
        }
           case 2:{
             System.out.println("Enter Length & Breadth");
             l=in.nextFloat();
             b1=in.nextFloat();
             System.out.println("Area of Rectangle is "+(1/2)*b1*l);
             break;
           }
           case 3:{
            System.out.println("Enter Base & Height");
            b=in.nextFloat();
            h=in.nextFloat();
            System.out.println("Area of Rectangle is "+(1/2)*b*h);
            break;
           }
           case 4:{
            System.out.println("Enter Base & Height");
            b=in.nextFloat();
            h=in.nextFloat();
            System.out.println("Area of Parallelogram is "+b*h);
            break;
           }
           case 5:{
            System.out.println("Enter diag1 and diag2");
            diag1=in.nextFloat();
            diag2=in.nextFloat();
            System.out.println("Area of Rhombus is "+(diag1*diag2)/2);
            break;
           }
           case 6:{
            System.out.println("Enter side for equilateral triangle");
            b=in.nextFloat();
            System.out.println("Area of Equi Triangle is "+(1.732/4)*b*b);
            break;
           }
           case 7:{
            System.out.println("Enter Radius");
            b=in.nextFloat();
            System.out.println("Perimeter of Circle is "+2*pi*b);
            break;
           }
           case 8:{
            System.out.println("Enter Side");
            b=in.nextFloat();
            System.out.println("Perimeter Of Equilateral Triangle is "+b*3);
            break;
           }
           case 9:{
            System.out.println("Enter Length and Breath");
            l=in.nextFloat();
            b=in.nextFloat();
            System.out.println("Perimeter Of Parallelogram is "+(l+b*2));
            break;
           }
           case 10:{
            System.out.println("Enter Length and Breath");
            l=in.nextFloat();
            b=in.nextFloat();
            System.out.println("Perimeter Of Rectangle is "+(l+b)*2);
            break;
           }
           case 11:{
            System.out.println("Enter Length");
            l=in.nextFloat();
            System.out.println("Perimeter Of Square is "+4*l);
            break;
           }
           case 12:{
            System.out.println("Enter Length");
            l=in.nextFloat();
            System.out.println("Perimeter Of Rhombus is "+4*l);
            break;
           }
           case 13:{
            System.out.println("Enter Radius and height");
            r=in.nextFloat();
            h=in.nextFloat();
            System.out.println("Volume of cone is "+(r*r*h*pi*(1/3)));
            break;
        }
          case 14:{
            System.out.println("Enter Base area and Height");
            b=in.nextFloat();
            h=in.nextFloat();
            System.out.println("Volume of Prism is "+b*h);
            break;
          }
          case 15:{
            System.out.println("Enter Radius and Height");
            r=in.nextFloat();
            h=in.nextFloat();
            System.out.println("Volume Of Cylinder is "+pi*r*r*h);
            break;
          }
          case 16:{
            System.out.println("Enter Radius");
            r=in.nextFloat();
            System.out.println("Volume Of Sphere is "+pi*r*r*r*(4/3));
            break;
          }
          case 17:{
            System.out.println("Enter Base area and Height");
            b=in.nextFloat();
            h=in.nextFloat();
            System.out.println("Volume of Pyramid is "+(1/3)*b*h);
            break;
          }
        case 18:{
            System.out.println("Enter Radius and height");
            r=in.nextFloat();
            h=in.nextFloat();
            System.out.println("Curved Surface Area Of Cylinder is "+(2*pi*r*h));
            break;
        }
        case 19:{
            System.out.println("Enter Side");
            b=in.nextFloat();
            System.out.println("Total Surface Area Of Cube is "+b*b*6);
            break;
        }
        
        
    }
}while(option!=0);
    }
}
