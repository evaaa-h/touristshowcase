package unit4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainSortingStudents {

    static void  main(){
        Student s1 = new Student(4, "Michael", 33, 2d);
        Student s2 = new Student(2, "Michael", 13, 2d);
        Student s3 = new Student(8, "Michael", 23, 4);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        Collections.sort(students);
        students.forEach(System.out::println);
    }
}
