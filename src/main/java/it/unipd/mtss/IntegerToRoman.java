////////////////////////////////////////////////////////////////////
// [Filippo]  [Panighello] [2111016]
// [Riccardo] [Manisi]     [9111948]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    private IntegerToRoman() {}     // Altrimenti JaCoCo si aspetta test sull'istanziazione

    
    public static String convert(int number) {
        int[] valori = {10, 9, 5, 4, 1};
        String[] simboli_romani = {"X","IX","V","IV","I"};
        String result = "";
        
        for (int i = 0; i < valori.length && number > 0; i++) {
            while (number >= valori[i]) {
                number -= valori[i];
                result += simboli_romani[i];
            }
        }
        return result.toString();
    }
}


// SYMBOLS "M",  "CM","D", "CD","C", "XC","L", "XL",

// VALUES 1000, 900, 500, 400, 100, 90, 50, 40, 