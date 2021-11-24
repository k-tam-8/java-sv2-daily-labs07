package day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MovieService {
    private List<Movie> movieList = new ArrayList<>();

    public MovieService(Path path) {
        List<String> tempList = readFileIn(path);
        for (int i = 0; i < tempList.size(); i++) {
            String[] movieData = tempList.get(i).split(";");
            Movie movie = new Movie(movieData[0], Integer.parseInt(movieData[1]), movieData[2]);
            movieList.add(movie);
        }
    }

    public List<String> readFileIn(Path path) {
        List<String> tempList = new ArrayList<>();
        try {
            tempList = Files.readAllLines(path);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return tempList;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }
}
