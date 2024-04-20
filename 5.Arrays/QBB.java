import java.util.*;
class QBB{
    public static void main(String args[]){
        //1.Build array from Permutations
        int max,temp,e=0,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int a=sc.nextInt();
      //  System.out.println("Enter extra candies");
       // int n=sc.nextInt();
         int[] arr=new int[a];
         for(i=0;i<a;i++)
          arr[i]=sc.nextInt();
         int[] sum=new int[a];
         /*Arrays.fill(sum,0);
         for(i=0;i<a;i++){
            System.out.println("Enter Row "+(i+1));
        for(j=0;j<b;j++){
            arr[i][j]=sc.nextInt();
        }
         }*/
       /*   for(i=0;i<a;i++){
            System.out.print(arr[arr[i]]+" ");
         }*/
         //2. Concatenation of Array
       /*   for(int i=0;i<a;i++){
            arr1[i]=arr[i];
            arr1[i+a]=arr[i];
         }
         for(int j:arr1)
            System.out.print(j+" ");
         }*/
          //3.Running Sum of 1 D array
     /*   for(i=0;i<a;i++)
         sum+=arr[i];
         System.out.print(sum);*/
         //4.Richest Customer Wealth
       /*  for(i=0;i<a;i++){
            for(j=0;j<b;j++){
                sum[i]=sum[i]+arr[i][j];
            }
         }
          max=sum[0];
         for(i=0;i<a;i++){
           for(j=i+1;j<a;j++){
            if(sum[j]<sum[i]){
                temp=sum[i];
                sum[i]=sum[j];
                sum[j]=temp;
            }
           }
         }
            System.out.print("The richest customer wealth is "+sum[a-1]+" ");
        */
       //5.Shuffle the array
       /*  for(i=0;i<2*n;i++){
            if(i%2==0) 
             brr[i]=arr[i/2];
            else
             brr[i]=arr[n+i/2];
        }
        for(i=0;i<a;i++){
            System.out.print(brr[i]+" ");
        }*/
        //7.  How Many Numbers Are Smaller Than the Current Number
      /*    e=0;
        for(i=0;i<a;i++){
            for(j=0;j<a;j++){
                if(arr[i]>arr[j])
                 e++;
            }
            sum[i]=e;
            e=0;
        }
           for(i=0;i<a;i++){
            System.out.print(sum[i]+" ");
           }*/
           
           
        }
    }
