import java.util.*;

import static java.lang.Math.*;
public class Problems {
    public static void main(String[] args) {
      Integer arr[]= new Integer[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        List<Integer> listTemp=Arrays.asList(arr);
        List<Integer> list=new ArrayList<>(listTemp);
        list.add(10);
        list.stream().filter(n->n!=0);
        Integer arr1[]={};
        Comparator<Integer> cmp=(x,y)-> x+y;
        Arrays.equals(arr,arr1,(x,y)-> x+y);


/*        Collection<? extends Integer> l=new ArrayList<>();
        ArrayList<Integer> l1=new ArrayList<>();
        l=l1;
        for (Integer i:l){
 */
        Comparator<Integer> reverse=(x,y)->y-x;
        Arrays.sort(arr,reverse);
        System.out.println(Arrays.toString(arr));

        /*Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        boolean flag=true;
        for(int i=0;i<x;i++){
            if(arr[i]!=arr[n-x+i]){
                flag=false;
            }
        }
        System.out.println(flag?"yes":"no");*/

       // System.out.println(nextConsonant('T'));
       /* int n=12;
        int x=n&(~(n-1));
        System.out.println(Math.log(1000));
        System.out.println(Math.log(1000)/Math.log(10));
        System.out.println(Math.log10(1000));*/
       // System.out.println(Math.log(x)/Math.log(2));

     // System.out.println(log(16)/log(2));
       // System.out.println(fisrtLastDigit(567));
        //System.out.println(checkKthBit(39,5));
        //System.out.println(fisrtLastDigit(43561));

       /* Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(),M=sc.nextInt(),K=sc.nextInt();
        int value=(int)Math.pow(M,N)/(int)Math.pow(10,K-1);
        System.out.println(value%10);*/

      /* Scanner sc=new Scanner(System.in);
        String a=sc.next(),b=sc.next();
        List<String> set1=subSeq(a);
        List<String> set2=subSeq(b);
        for (String y:set1){
            if(set2.contains(y)){
                System.out.print(y+" ");
            }
        }
*/
        //System.out.println(decimalToBinary(2));
    }
    static String decimalToBinary(int n){
        if(n==0){
            return "";
        }
        return decimalToBinary(n/2)+n%2;

    }
    static LinkedHashSet<String> subSeq(String str){
        int n=str.length();
        int psize=(1<<n);
        LinkedHashSet<String> set=new LinkedHashSet<>();
        for (int i=0;i<psize;i++){
            String x="";
            for (int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    x+=str.charAt(j);
                }
            }
            set.add(x);
        }
        set.remove("");
        return set;
    }

    static int[] arrayFun(int[] arr,int a){
       int n=arr.length;
        for(int i=0;i<n;i++){
            if((i+a)<n){
                arr[i+a]=arr[i];
            }


        }  return arr;
    }
    static boolean checkKthBit(int n, int k)
    {
        // Your code here
        int x=(n>>(k-1));
        if((x&1)!=0){
            return true;
        }else{
            return false;
        }
    }
    static int fisrtLastDigit(int n){
        int res;
        res=n%10;
        int l=(int)Math.log10(n);
        res+=(n/(int)Math.pow(10,l))*10;
        return res;
    }
    static String finMissing(String str){
        String result="";
        int arr[]=new int[26];
        for(int i=0;i<str.length();i++){
            int index=str.charAt(i)-'a';
            arr[index]=1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                char ch=(char)(i+'a');
                result+=ch;
            }
        }
        return result;
    }
    static int findOdd(int[] arr, int n){
        int res=arr[0];
        for(int i=1;i<n;i++){
            res=res^arr[i];
        }
        return res;
    }
    public static int removeDuplicates(int[] nums) {
        int p=0;
        for(int i=1;i<nums.length;i++){
            if(nums[p]!=nums[i]){
                nums[p+1]=nums[i];
                p++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return p;
    }
    public static char nextConsonant(char ch){
        List<Character> list=Arrays.asList('A','E','I','O','U');
        int result=ch+1;
        if(list.contains((char)(ch+1))){
            result++;
        }
        return (char)result;
    }
    public static long sumUnderModulo(long a, long b){
        // code here
        return (b+1000000007);
    }
    public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> list=new ArrayList<>(2);
        double temp=Math.sqrt((b*b)-(4.0*a*c));
        double x=(double)(-b-temp)/(2.0*a);
        double y=(double)(-b+temp)/(2.0*a);
        list.add((int)x);
        list.add((int)y);
        return list;
    }
    static void sieve(int n){
        boolean[] isPrime=new boolean[n+1];
        Arrays.fill(isPrime,true);
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.print(i+" ");
                for (int j=i*i;j<=n;j=j+i){
                    isPrime[j]=false;
                }
            }
        }

    }
    static String prependAppend(String str,char c){
        if(!(str.charAt(0)==c)){
            str=c+str;
        }
        if(!(str.charAt(str.length()-1)==c)){
            str=str+c;
        }
        return str;
    }
    static void number(int[] arr){
        System.out.println(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                System.out.println(arr[i]);
            }
        }
    }
    static void allDivisors(int n){
        int i;
        for(i=1;i*i<n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        for(;i>=1;i--){
            if(n%i==0){
                System.out.println(n/i);
            }
        }
    }
    static void doublePrint(double x,double y){
        for (int i=(int)(x*10);i<=y*10;i=i+1){
            System.out.print((i/10.0)+" ");
        }
    }
}
