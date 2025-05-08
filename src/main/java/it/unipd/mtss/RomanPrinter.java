////////////////////////////////////////////////////////////////////
// [Filippo]  [Panighello] [2111016]
// [Riccardo] [Manisi]     [9111948]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        return null;
    }
}



/*
 * private static String printAsciiArt(String romanNumber) {
        String asciiArt = "";
        if (romanNumber.equals("I")) {
            asciiArt =    " _____ \n" 
                        + "|_   _|\n"
                        + "  | |  \n"
                        + "  | |  \n"
                        + " _| |_ \n"
                        + "|_____|\n";
        } else if (romanNumber.equals("II")) {
            asciiArt =    " _____   _____ \n" 
                        + "|_   _| |_   _|\n"
                        + "  | |     | |  \n"
                        + "  | |     | |  \n"
                        + " _| |_   _| |_ \n"
                        + "|_____| |_____|\n";
        } else if (romanNumber.equals("III")) {
            asciiArt =    " _____   _____   _____ \n" 
                        + "|_   _| |_   _| |_   _|\n"
                        + "  | |     | |     | |  \n"
                        + "  | |     | |     | |  \n"
                        + " _| |_   _| |_   _| |_ \n"
                        + "|_____| |_____| |_____|\n";
        }

        return asciiArt;
    }
 */