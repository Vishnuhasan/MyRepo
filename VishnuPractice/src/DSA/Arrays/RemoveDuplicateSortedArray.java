package DSA.Arrays;

import java.util.Arrays;

public class RemoveDuplicateSortedArray {

    public static void main(String[] args) {
        int[] arr = {10,20,20,30,30,30};
        //int[] arr = {10,4,30,4,5};
        System.out.println(remDups(arr));
        System.out.println(Arrays.toString(arr));
    }
    public static int remDups(int arr[]){
        int n= arr.length;
        int res=0;
        for (int j=1;j<n;j++){
            if(arr[res]!=arr[j]){
                res++;
                arr[res]=arr[j];
            }

            System.out.println(Arrays.toString(arr));
        }
        return res+1;
    }
}
