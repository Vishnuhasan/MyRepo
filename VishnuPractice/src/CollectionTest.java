import java.net.Inet4Address;
import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(11);
        list.ensureCapacity(1);
        list.add(1);
        list.add(2);
        list.add(0,10);
        list.set(0,11);
        //System.out.println(list);
        System.out.println();
        System.out.println(CollectionTest.class);
        list.toArray();
        Comparator<Map.Entry<Integer,String>> entrySetComparator = (es1,es2)-> es1.getKey()<es2.getKey() ? 1:-1;
        list.ensureCapacity(100);
/*        List<Integer> arrList=new ArrayList<>();
        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        arrList.add(40);
        arrList.add(50);
        arrList.add(60);
        arrList.add(70);
        arrList.add(80);
        arrList.add(90);
        arrList.add(100);
        arrList.remove((Integer)100);
        for (Integer i:arrList) {
            System.out.println(i);
        }
        Iterator<Integer> itr= arrList.iterator();
        while(itr.hasNext()){
           if(itr.next()==30){
               itr.remove();
           }
        }
        System.out.println(arrList.toString());
        LinkedList linkedList=new LinkedList<>();*/

        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"ABC");
        map.put(2,"LMNO");
        map.put(3,"XYZ");

        for (Map.Entry<Integer,String> entry: map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" = "+value);
        }

    }

}
