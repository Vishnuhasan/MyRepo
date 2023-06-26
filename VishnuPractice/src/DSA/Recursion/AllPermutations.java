package DSA.Recursion;

public class AllPermutations {
    public static void main(String[] args) {
        String s="ABCD";
        int n=s.length();
        permutation(s,n,0);
        System.out.println(4*3*2*1);
    }
    static void permutation(String s,int n,int i){
        if(i==n){
            System.out.println(s);
            return;
        }
        for (int j=i;j<n;j++){
            s=swap(s,i,j);
            permutation(s,n,i+1);
            s=swap(s,j,i);
        }
    }
    static String swap(String str,int i,int j){
        char[] charArray=str.toCharArray();
        char temp=charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;
        return new String(charArray);
    }
}
