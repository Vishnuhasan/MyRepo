import java.util.Scanner;
class Car{
    int c;
    int i;
    public Car(int c){
        this.c=c;
    }
}
public class Main {
    public static void main(String[] args) {
        Car x=new Car(2);
        System.out.println(x.i);
    }
    static int fun(int n){
        if(n==2){
            return 2;
        }
        return (n)*fun(n-1);
    }
    static int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
    static int last_digit(String str){
        int l=str.length(),result=-1;
        if(Character.isDigit(str.charAt(l-1))){
            int x=str.charAt(l-1)-'0';
            l--;
            if(l/10==x){
                result=l%10;
            }

        }else if(l<10){
            result =l;
        }
        return result;
    }
}