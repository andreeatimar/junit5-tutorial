package junit5tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledEnabledTests {

    @Test
    @Disabled (value = "disabled for this tutorial purpose")
    void firstTest() {
        System.out.println("This is the first test method");
    }

    @Test
    void secondTest() {
        System.out.println("This is the second test method");
    }

    @Test
    void thirdTest() {
        System.out.println("This is the third test method");
    }

    @Test
    void fourthTest() {
        System.out.println("This is the fourth test method");
    }

    @Test
    void fifthTest() {
        System.out.println("This is the fifth test method");
    }
}
