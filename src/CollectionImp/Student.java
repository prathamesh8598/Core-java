package CollectionImp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student>{
    int id;
    int marks;
    String name;

    public Student(int id, int marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }
    @Override
    public int compareTo(CollectionImp.Student o) {
        return this.id-o.id;
    }


    public static void main(String[] args) {
        Student student1 = new Student(7,63,"xyz");
        Student student2 = new Student(3,85,"abc");
        Student student3 = new Student(5,74,"lmn");
        Student student4 = new Student(6,37,"efg");
        Student student5 = new Student(2,49,"pqr");
        List<Student>students=new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        Collections.sort(students,(Comparator.comparingInt(o -> o.id)));
        System.out.println(students);
    }


}
