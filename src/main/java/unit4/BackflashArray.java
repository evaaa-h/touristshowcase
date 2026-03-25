package unit4;

import java.util.ArrayList;
import java.util.Collections;

public class BackflashArray {

    static void main(){

        String [] someDATA = new String[10];
        ArrayList<String> someDATA2 = new ArrayList<>();
        someDATA2.add("Zebra");
        someDATA2.add("Lion");
        someDATA2.add("Elephant");
        someDATA2.add("Ant");

        Collections.sort(someDATA2);
        someDATA2.forEach(System.out::println);

        char c = 'Z';
        System.out.println((int)c); //to see the asti code
        System.out.println((int)'A');
        System.out.println(c);

    }



}
