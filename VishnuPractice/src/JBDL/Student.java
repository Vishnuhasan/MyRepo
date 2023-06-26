package JBDL;

import java.util.Random;

public class Student implements Cloneable{
    private int id;
    private String name;
    private int[] marks;
    public Student(int id,String name,int[] marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return id+" "+name;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int hashCode() {
        return new Random().nextInt();
    }
}
