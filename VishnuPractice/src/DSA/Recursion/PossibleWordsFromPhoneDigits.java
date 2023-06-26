package DSA.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PossibleWordsFromPhoneDigits {
    public static void main(String[] args) {
        int N = 5;
        int[] a={5,8,8,9,8};
        System.out.println(possibleWords(a,N).size());
    }
    static List<String> list = Arrays.asList("","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz");
    static ArrayList<String> result = new ArrayList<>();
    static ArrayList <String> possibleWords(int a[], int N)
    {
        possibility(a,N,0,"");
        return result;
    }
    private static void possibility(int a[], int N, int i, String s){
        if(i==N){
            result.add(s);
            return;
        }
        String str= list.get(a[i]);
        for(int j=0;j<str.length();j++){
            possibility(a,N,i+1,s+str.charAt(j));
        }
    }
}
