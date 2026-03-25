package unit3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HotelMain {

    static void main() throws FileNotFoundException {

        ArrayList<Hotel> ALL_HOTELS = HotelUtility.loadHotelsFromFile();

        ALL_HOTELS.forEach((hotel -> {
            System.out.println(hotel.getCategory());
        }));

        ALL_HOTELS.forEach(System.out::println);
    }

}
