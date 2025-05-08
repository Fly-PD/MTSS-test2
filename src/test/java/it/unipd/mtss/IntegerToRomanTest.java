////////////////////////////////////////////////////////////////////
// [Filippo]  [Panighello] [2111016]
// [Riccardo] [Manisi]     [9111948]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {
    /// Primi 3
    @Test
    public void uno() {
        int input = 1;
        String result = IntegerToRoman.convert(input);
        assertEquals("I", result);
    }

    @Test
    public void due() {
        int input = 2;
        String result = IntegerToRoman.convert(input);
        assertEquals("II", result);
    }

    @Test
    public void tre() {
        int input = 3;
        String result = IntegerToRoman.convert(input);
        assertEquals("III", result);
    }

    /// Primi 6
    @Test
    public void quattro() {
        int input = 4;
        String result = IntegerToRoman.convert(input);
        assertEquals("IV", result);
    }

    @Test
    public void cinque() {
        int input = 5;
        String result = IntegerToRoman.convert(input);
        assertEquals("V", result);
    }

    @Test
    public void sei() {
        int input = 6;
        String result = IntegerToRoman.convert(input);
        assertEquals("VI", result);
    }

    /// Primi 10
    @Test
    public void sette() {
        int input = 7;
        String result = IntegerToRoman.convert(input);
        assertEquals("VII", result);
    }

    @Test
    public void nove() {
        int input = 9;
        String result = IntegerToRoman.convert(input);
        assertEquals("IX", result);
    }

    @Test
    public void dieci() {
        int input = 10;
        String result = IntegerToRoman.convert(input);
        assertEquals("X", result);
    }

    /// Primi 20
    @Test
    public void quattordici() {
        int input = 14;
        String result = IntegerToRoman.convert(input);
        assertEquals("XIV", result);
    }

    @Test
    public void quindici() {
        int input = 15;
        String result = IntegerToRoman.convert(input);
        assertEquals("XV", result);
    }

    @Test
    public void diciannove() {
        int input = 19;
        String result = IntegerToRoman.convert(input);
        assertEquals("XIX", result);
    }

    @Test
    public void venti() {
        int input = 20;
        String result = IntegerToRoman.convert(input);
        assertEquals("XX", result);
    }

}
