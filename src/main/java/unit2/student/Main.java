package unit2.student;

public class Main {

    static void main(String[] args) {
       // Student s = new Student();  //no args
        Student temp= new Student("sdg","fcgvhbjn", "tzuhijok");

        Student student = new Student(1, "ibiu", "biubo", "uhub", "ihuho", "ooun", true, null);
        student.getId();
        student.getEmail();
        System.out.println(student);
       // System.out.println(s);
        System.out.println(temp);

    }

}
