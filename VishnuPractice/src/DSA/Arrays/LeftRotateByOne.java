package DSA.Arrays;

public class LeftRotateByOne {

    public static void rotateByOne(int[] arr){
        int temp = arr[0], n = arr.length;
        for (int i = 1 ; i<n ; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
}
