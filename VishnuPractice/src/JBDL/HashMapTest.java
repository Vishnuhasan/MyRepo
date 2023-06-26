package JBDL;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        Student s1=new Student(1,"vishnu", new int[]{95, 99,100,97,96});
        Student s2=new Student(1,"vishnu", new int[]{95, 99,100,97,96});
        Student s3=new Student(1,"vishnu", new int[]{95, 99,100,97,96});
        HashMap<Student,Integer> map=new HashMap<>();
        map.put(s1,s1.getId());
        map.put(s2,s1.getId());
        map.put(s3,s1.getId());
        System.out.println(map);
        /**
         * Contract
         * Different objects can have same hash code
         * equal objects MUST have same hash code
         */
    }
}
