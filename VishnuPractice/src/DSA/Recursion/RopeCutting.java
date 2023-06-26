package DSA.Recursion;

public class RopeCutting {
    public static void main(String[] args) {
        System.out.println(maxPieces(5,2,5,3));
    }
    public static int maxPieces(int n,int a,int b,int c){
        if(n==0)
            return n;
        if(n<0)
            return -1;
        int res=Math.max(Math.max(maxPieces(n-a,a,b,c),maxPieces(n-b,a,b,c)),maxPieces(n-c,a,b,c));
        if(res==-1)
            return res;
        return res+1;
    }
}

