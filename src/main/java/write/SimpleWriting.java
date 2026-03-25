package write;

import unit3.Hotel;
import unit3.HotelUtility;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class SimpleWriting {
    static void main () throws IOException{
        ArrayList<Hotel> hotels = HotelUtility.loadHotelsFromFile();

        writeBackup(hotels);

    }

    private static void writeBackup(ArrayList<Hotel> hotels) throws IOException {
        String adress = "output/backup.txt";
        Path path = Path.of(adress);

        ArrayList<String> SOME_DATA = new ArrayList<>();

        for (Hotel hotel : hotels) {
            SOME_DATA.add(hotel.toCSV());
        }


        boolean append = false;

        Files.write(path, SOME_DATA, StandardCharsets.UTF_8, append ? StandardOpenOption.APPEND : StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.CREATE);

        JOptionPane.showMessageDialog(null, "file was written successfully");   // null, because there is no mother for now

        int answer= JOptionPane.showConfirmDialog(null, "you wann see the content?");
        System.out.println(answer); //dann sieht man was kommt wenn jemand "JA" drückt (?)

        if(answer == 1){
            Desktop.getDesktop().open(path.toFile());
        }
    }
}
