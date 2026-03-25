package unit2.lecturer;

public class MainWithCondition {
    public static void main(String[] args) {

       // Lecturer l = Lecturer.builder().build();
        String email = "aswd";

        var temp = Lecturer.builder().id(1).name("heinzi"); //pre build it, mandatory fills, but the build is missing, flexible, this way you can work on email extra

        if(email != null || !email.isEmpty())  temp.email(email);

        Lecturer l = temp.build();
    }
}
