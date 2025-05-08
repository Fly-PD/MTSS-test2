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
        int input = 1;                                      // Arrange
        String result = IntegerToRoman.convert(input);      // Act
        assertEquals("I", result);                 // Assert
    }
    




}
