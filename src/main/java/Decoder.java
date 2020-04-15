import java.util.HashMap;
import java.util.Map;

public class Decoder {

    public static String decode(String encoded) {
        // String[] str1 = {"XOXXXO", "XXXOXOXOXO", "XXXOXOXXXOXO", "XXXOXOXOXXXO", "XO", "XOXOXXXOXO", "XXXOXXXOXO", "XOXOXOXO", "XOXO", "XOXXXOXXXOXXXO", "XXXOXOXXXO", "XOXXXOXOXO", "XXXOXXX", "XXXOXO", "XXXOXXXOXXXO", "XOXXXOXXXOXO", "XXXOXXXOXOXXXO", "XOXXXOXO", "XOXOXO", "XXXO", "XOXOXXXO", "XOXXXOXXXO", "O", "XXXOXOXXXOXXXO", "XXXOXXXOXOXO", "XXXOXXXOXOXO "};
        //String[] str2 = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        // X = "dit", XXX = "Dah", O = no sound,  OOOOOOO = space between words
        Map<String, String> str = new HashMap<>();

        str.put("XOXXXO", "A"); //.-
        str.put("XXXOXOXOXO", "B");  //-...
        str.put("XXXOXOXXXOXO", "C"); //-.-.
        str.put("XXXOXOXOXXXO", "D"); //-..
        str.put("XO", "E"); //.
        str.put("XOXOXXXOXO", "F"); //..-.
        str.put("XXXOXXXOXO", "G"); //--.
        str.put("XOXOXOXO", "H"); //....
        str.put("XOXO", "I"); //..
        str.put("XOXXXOXXXOXXXO", "J"); //.---
        str.put("XXXOXOXXXO", "K"); //-.-
        str.put("XOXXXOXOXO", "L"); //.-..
        str.put("XXXOXXX", "M"); //--
        str.put("XXXOXO", "N"); //-.
        str.put("XXXOXXXOXXXO", "O"); //---
        str.put("XOXXXOXXXOXO", "P"); //.--.
        str.put("XXXOXXXOXOXXXO", "Q"); //--.-
        str.put("XOXXXOXO", "R"); //.-.
        str.put("XOXOXO", "S"); //...
        str.put("XXXO", "T"); //-
        str.put("XOXOXXXO", "U"); //..
        str.put("XOXXXOXXXO", "V"); //...-
        str.put("O", "W"); //.--
        str.put("XXXOXOXXXOXXXO", "X"); //-..-
        str.put("XXXOXXXOXOXO", "Y"); //-.--
        str.put("XXXOXXXOXOXO", "Z"); //--..
        str.put("OOOOOOO", " ");

        {
            for(int i = 0; i < encoded.length(); i++) {
               // if(encoded.charAt(i) == str.containsKey(value))
                throw new IllegalArgumentException();
            }
        }
        return null;
    }
}


