package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testMainOutput() {
        // Given
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        // When
        Main.main(new String[]{});
        // Then
        System.setOut(originalOut);
        String output = outContent.toString();
        assertTrue(output.contains("Інверсована мапа"));
        assertTrue(output.contains("{1=A") || output.contains("{1=C"));
    }
}