package DSA.Recursion;

public class CountSubsetSum {
    public static void main(String[] args) {
        int[] arr={10,20,15,5};
        System.out.println(countSubset(arr, arr.length, 25));
        System.out.println(countSubset2(arr,0,25,0));
    }
    //counts no of sub sets whose sum == sum
    public static int countSubset(int[] arr,int n,int sum){
        if(n==0){
            return sum==0 ? 1:0;
        }
        return countSubset(arr, n-1, sum) + countSubset(arr, n-1, sum-arr[n-1]);
    }
    public static int countSubset2(int[] arr,int i,int sum,int temp){
        if(i == arr.length){
            return temp==sum ? 1:0;
        }
        return countSubset2(arr, i+1,sum, temp) + countSubset2(arr, i+1,sum,temp+arr[i]);
    }
}
