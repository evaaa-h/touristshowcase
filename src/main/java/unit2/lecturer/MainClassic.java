package unit2.lecturer;

public class MainClassic {
    public static void main(String[] args) {

        Lecturer first = Lecturer.builder().id(1).email("aswd").name("heinzi").build();
        Lecturer second = Lecturer.builder().id(1).email("234").build();
        System.out.println(first);
        System.out.println(second);
    }
}
