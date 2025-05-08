////////////////////////////////////////////////////////////////////
// [Filippo]  [Panighello] [2111016]
// [Riccardo] [Manisi]     [9111948]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number == 6) {return "VI";}
        if (number == 5) {return "V";}
        if (number == 4) {return "IV";}
        return "I".repeat(number);
    }
}