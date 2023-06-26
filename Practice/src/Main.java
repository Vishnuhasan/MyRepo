import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public String solution(String S){
        char[] arr= S.toCharArray();
        Arrays.sort(arr);
        for(int i=0;i< arr.length;i++){
        
        }
    }
    static int count(char x,char[] arr){
        int c=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==x){
                c++;
            }
        }
        return c;
    }
}