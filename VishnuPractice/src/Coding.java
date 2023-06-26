import java.util.Scanner;

public class Coding {

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        pattern(sc.nextInt());
    }
    static void pattern(int n){
        int index=1;
        for(int i=1;i<2*n;i++){
            for(int j=1;j<2*n;j++){
                if(j==index||j==(2*n-index)){
                    if(i>n)
                        System.out.print(2*n-i);
                    else
                        System.out.print(i);
                }else {
                    System.out.print(" ");
                }
            }
            index++;
            System.out.println();
        }
    }
}
