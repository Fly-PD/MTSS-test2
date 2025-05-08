////////////////////////////////////////////////////////////////////
// [Filippo]  [Panighello] [2111016]
// [Riccardo] [Manisi]     [9111948]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    private IntegerToRoman() {}     // Altrimenti JaCoCo si aspetta test sull'istanziazione

    public static String convert(int number) {
        String result = "";
        if (number == 5) { result = "V"; }
        if (number == 4) { result = "IV"; }
        if (number < 4) { result = "I".repeat(number); }
        if (number > 5) {
            result = "V" + "I".repeat(number - 5);
        }
        return result;
    }
}