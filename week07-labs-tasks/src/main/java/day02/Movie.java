package day02;

public class Movie {
    private String title;
    private int yearOfProduction;
    private String directorName;

    public Movie(String title, int yearOfProduction, String directorName) {
        this.title = title;
        this.yearOfProduction = yearOfProduction;
        this.directorName = directorName;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getDirectorName() {
        return directorName;
    }
}
