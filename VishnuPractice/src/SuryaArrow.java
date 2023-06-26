import java.util.*;

public class SuryaArrow {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ids = new int[n];
        for (int i = 0; i < n; i++) {
            ids[i] = sc.nextInt();
        }

        int maxKills = n;
        Set<Integer> set=new HashSet<>();
        for (Integer t : ids) {
            set.add(t);
        }
        int c=Integer.MAX_VALUE;
        for(Integer x:set){
           int temp=0;
            for(int i=0;i<n;i++){
                if(x==ids[i]){
                    temp++;
                }
            }
            if(temp<c){
                c=temp;
            }
        }

        System.out.println(c* set.size());
    }
}