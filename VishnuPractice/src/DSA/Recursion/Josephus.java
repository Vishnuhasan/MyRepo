package DSA.Recursion;

public class Josephus {
    public static void main(String[] args) {
        System.out.println(jos(4,0));
    }
    static int jos(int n, int k){
        if(n==1){
            return 0;
        }else{
            int temp =jos(n-1,k);
            System.out.println(temp);
            return (temp+k)%n;
        }
    }
}
