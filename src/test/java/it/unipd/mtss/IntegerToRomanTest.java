////////////////////////////////////////////////////////////////////
// [Filippo]  [Panighello] [2111016]
// [Riccardo] [Manisi]     [9111948]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

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

    @Test
    public void quattro () {
        int input = 4;
        String result = IntegerToRoman.convert(input);
        assertEquals("IV", result);    
    }

    @Test
    public void cinque () {
        int input = 5;
        String result = IntegerToRoman.convert(input);
        assertEquals("V", result);    
    }

    @Test
    public void sei () {
        int input = 6;
        String result = IntegerToRoman.convert(input);
        assertEquals("VI", result);   
    }

}
