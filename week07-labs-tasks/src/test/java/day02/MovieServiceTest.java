package day02;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {
    @Test
    void testReadFile() {
        List<String> testList = new ArrayList<>();
        MovieService ms = new MovieService(Path.of("src/main/resources/movie.csv"));
        testList = ms.readFileIn(Path.of("src/main/resources/movie.csv"));
        assertEquals("Jurassic park;1993;Steven Spielberg",testList.get(0));
        assertEquals("Jaws;1975;Steven Spielberg",testList.get(4));
    }

    @Test
    void testConstructor() {
        MovieService ms = new MovieService(Path.of("src/main/resources/movie.csv"));
        assertEquals(5,ms.getMovieList().size());
        assertEquals("Titanic",ms.getMovieList().get(1).getTitle());
        assertEquals(1975,ms.getMovieList().get(4).getYearOfProduction());
    }
}