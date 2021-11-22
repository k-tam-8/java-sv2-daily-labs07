package day01;

import java.time.LocalDate;

public class Human {
    private String name;
    private int yearOfBirth;

    public Human(String name, int yearOfBirth) {
        boolean isValidName = false;
        for (int i = 0; i < name.trim().length(); i++) {
            if (Character.isWhitespace(name.trim().charAt(i))) {
                //name != null && name.indexof(" ")>0
                isValidName = true;
            }
        }
        if (isValidName) {
            this.name = name;
        } else throw new IllegalArgumentException("Vezetéknév és keresztnév kötelező!");
        if (yearOfBirth >= (LocalDate.now().getYear() - 120)) {
            this.yearOfBirth = yearOfBirth;
        } else throw new IllegalArgumentException("Maximum 120 év megengedett!");
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
