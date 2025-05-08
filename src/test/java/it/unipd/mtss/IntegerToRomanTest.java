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
        assertEquals("I", IntegerToRoman.convert(1));
    }
    
    @Test
    public void due() {
        assertEquals("II", IntegerToRoman.convert(2));
    }

    @Test
    public void tre() {
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test
    public void quattro() {
        assertEquals("IV", IntegerToRoman.convert(4));
    }
  
    @Test
    public void cinque() {
        assertEquals("V", IntegerToRoman.convert(5));
    }

    @Test
    public void sei() {
        assertEquals("VI", IntegerToRoman.convert(6));
    }

}
