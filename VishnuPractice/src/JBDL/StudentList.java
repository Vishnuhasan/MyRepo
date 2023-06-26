package JBDL;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        Student s1=new Student(1,"vishnu", new int[]{95, 99,100,97,96});
        Student s2=new Student(2,"Hasan", new int[]{90,80,99,95,89});
        Student s3=new Student(3,"Nuha", new int[]{97,98,95,96,93});
        List<Student> students=new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        Iterator<Student> itr=students.iterator();
        while (itr.hasNext()){
            int total=0;
            Student s=itr.next();
            for (int i:s.getMarks()) {
                total+=i;
            }
            System.out.println(s+" Total "+total);
        }
    }


}
