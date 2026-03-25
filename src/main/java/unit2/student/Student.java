package unit2.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
@Data       //all the getter, setter and codes are already there
@AllArgsConstructor //constructor for all the arguments
@RequiredArgsConstructor


public class Student {
    int id;
    @NonNull
    String name;
    @NonNull
    String first_name;
    @NonNull
    String last_name;
    String email;
    String phone;
    boolean isActive;
    ArrayList<String> lectures;



}

