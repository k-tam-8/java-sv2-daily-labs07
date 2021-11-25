package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CourierFileManager {
    public  Courier createCourierByFile(Path path) throws IOException {
        Courier courier = new Courier();
        List<String> readFileIn = Files.readAllLines(path);
        for (int i = 0; i < readFileIn.size(); i++) {
            String[] convertLines = readFileIn.get(i).split(" ");
            Ride ride = new Ride(Integer.parseInt(convertLines[0]), Double.parseDouble(convertLines[1]), Integer.parseInt(convertLines[2]));
            courier.addRide(ride);
        }
        return courier;
    }
}
