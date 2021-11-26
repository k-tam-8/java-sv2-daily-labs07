package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product p) {
        if (p.getSellDate().isBefore(LocalDate.now())) {
            productList.add(p);
        } else throw new IllegalArgumentException("A dátum nem lehet később mint a mai!");
    }

    public void writeFile(int monthNumber) {
        List<String> listToWrite = new ArrayList<>();
        Month month = Month.of(monthNumber);
        for (Product product : productList) {
            if (product.getSellDate().getMonth().equals(month)) {
                listToWrite.add(product.getName() + ";" + product.getSellDate() + ";" + product.getPrice());
            }
        }
        String nameOfMonth = month.name();
        try {
            Files.write(Path.of("src/main/resources/" + nameOfMonth + ".csv"), listToWrite);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
