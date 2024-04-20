public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int[] arr1=Bubble(arr);
        for(int ch:arr1){
            System.out.print(ch+" ");
        }
    }
    public static int[] Bubble(int[] arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
    }
    return arr;
}
}