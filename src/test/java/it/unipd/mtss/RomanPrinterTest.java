////////////////////////////////////////////////////////////////////
// [Filippo]  [Panighello] [2111016]
// [Riccardo] [Manisi]     [9111948]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RomanPrinterTest {

    @Test
    public void uno() {
        int input = 1;
        String result = RomanPrinter.print(input);
        String asciiArt = " _____ \n" 
                        + "|_   _|\n"
                        + "  | |  \n"
                        + "  | |  \n"
                        + " _| |_ \n"
                        + "|_____|\n";
        assertEquals(asciiArt, result);
    }

    @Test
    public void due() {
        int input = 2;
        String result = RomanPrinter.print(input);
        String asciiArt = " _____   _____ \n" 
                        + "|_   _| |_   _|\n"
                        + "  | |     | |  \n"
                        + "  | |     | |  \n"
                        + " _| |_   _| |_ \n"
                        + "|_____| |_____|\n";
        assertEquals(asciiArt, result);
    }

    @Test
    public void tre() {
        int input = 3;
        String result = RomanPrinter.print(input);
        String asciiArt = " _____   _____   _____ \n" 
                        + "|_   _| |_   _| |_   _|\n"
                        + "  | |     | |     | |  \n"
                        + "  | |     | |     | |  \n"
                        + " _| |_   _| |_   _| |_ \n"
                        + "|_____| |_____| |_____|\n";
        assertEquals(asciiArt, result);
    }



}