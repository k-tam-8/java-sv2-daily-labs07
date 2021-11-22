package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    @Test
    void testHumanNameConstructor() {
        Human human = new Human("Kiss Béla",1905);
        assertEquals("Kiss Béla",human.getName());
        assertEquals(1905, human.getYearOfBirth());
    }

    @Test
    void isValidDayOfBirth() {
        IllegalArgumentException iae=assertThrows(IllegalArgumentException.class, ()->new Human("Bla bla", 1885));
        assertEquals("Maximum 120 év megengedett!", iae.getMessage());
    }
    @Test
    void isValidName() {
        IllegalArgumentException iae=assertThrows(IllegalArgumentException.class, ()->new Human("Blabla", 1952));
        assertEquals("Vezetéknév és keresztnév kötelező!", iae.getMessage());
    }
}