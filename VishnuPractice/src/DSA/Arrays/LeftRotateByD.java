package DSA.Arrays;

public class LeftRotateByD {

    public static void rotateByD(int[] arr,int d){
        int n = arr.length;;
        reverse(arr,0,d);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    private static void reverse(int[] arr, int low, int high){
        while (low<high){
            //swap
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
