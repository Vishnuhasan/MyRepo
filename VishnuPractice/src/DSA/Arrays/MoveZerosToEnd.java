package DSA.Arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {10,8,0,0,12,0};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void moveZeros(int[] arr){
        int n = arr.length;
        int i = 0;
        for (int j=0;j<n;j++){
            if(arr[j]!=0){
                swap(arr,i,j);
                i++;
            }
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
