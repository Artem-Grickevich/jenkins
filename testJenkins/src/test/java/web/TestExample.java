package web;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestExample {

    @Test
    void testik() {
        System.out.println("Hello, Test!");
        int x = 5;
        System.out.println("Value of x is: " + x);
        int y = 5;
        System.out.println("Value of y is: " + y);
        Assertions.assertEquals(x, y);
    }
}