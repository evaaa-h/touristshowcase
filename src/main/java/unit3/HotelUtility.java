package unit3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class HotelUtility {
    public static ArrayList<Hotel> loadHotelsFromFile() throws FileNotFoundException {
        ArrayList<Hotel> ALL_HOTELS = new ArrayList<Hotel>();
        String path ="src/main/resources/hotels.txt"; //path + hotels + extension      needs to be provided(?)

        Scanner sc = new Scanner(new File(path));       //"Add exception...."
        sc.nextLine();

        while (sc.hasNextLine()) {
            //System.out.println(sc.nextLine());
            String [] parts = sc.nextLine().split(",");     //split weil wir jedes attribut einer methode dann zuordnen wollen
            //System.out.println(Arrays.toString(parts));

            // System.out.println(parts[2].replaceAll("\"", ""));

            int id = Integer.parseInt(parts[0].replaceAll("\"", ""));    // only neccessary when its different data types
            String category = parts[1].replaceAll("\"", "");
            String name = parts[2].replaceAll("\"", "");
            String owner = parts[3].replaceAll("\"", "");
            String contact = parts[4].replaceAll("\"", "");
            String address = parts[5].replaceAll("\"", "");
            String city = parts[6].replaceAll("\"", "");
            String cityCode = parts[7].replaceAll("\"", "");
            String state = parts[8].replaceAll("\"", "");
            int noRooms = Integer.parseInt(parts[9].replaceAll("\"", ""));
            int noBeds = Integer.parseInt(parts[10].replaceAll("\"", ""));

            Hotel temp = new Hotel(id,category,name,owner,contact,address,city,cityCode,state,noRooms,noBeds);
            ALL_HOTELS.add(temp);

            //System.out.println("Only Hotel name: " + name);
        }
        return ALL_HOTELS;
    }
}
