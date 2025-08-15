package dev.alejandro.loop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TablaMultiplicacionTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        outContent.reset(); // Limpia antes de cada test para evitar acumulación
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    private String buildExpectedOutput(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            sb.append(n)
              .append(" x ")
              .append(i)
              .append(" = ")
              .append(n * i)
              .append(System.lineSeparator());
        }
        return sb.toString();
    }

    @Test
    void testUsingForLoop() {
        int n = 5;
        TablaMultiplicacion.usingForLoop(n);
        assertEquals(buildExpectedOutput(n), outContent.toString());
    }

    @Test
    void testUsingForeachLoop() {
        int n = 5;
        TablaMultiplicacion.usingForeachLoop(n);
        assertEquals(buildExpectedOutput(n), outContent.toString());
    }

    @Test
    void testUsingWhileLoop() {
        int n = 3;
        TablaMultiplicacion.usingWhileLoop(n);
        assertEquals(buildExpectedOutput(n), outContent.toString());
    }

    @Test
    void testUsingDoWhileLoop() {
        int n = 5;
        TablaMultiplicacion.usingDoWhileLoop(n);
        assertEquals(buildExpectedOutput(n), outContent.toString());
    }

    @Test
    void testUsingIterator() {
        int n = 5;
        TablaMultiplicacion.usingIterator(n);
        assertEquals(buildExpectedOutput(n), outContent.toString());
    }
}