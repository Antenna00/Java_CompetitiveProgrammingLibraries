package Class;

import java.util.ArrayList;
import java.util.Arrays;

public class Translation {

    // Array Translation from [String]
    public static <T> ArrayList<?> strToArrayList(String str, int convertTo) {
        /**
         * int 0: convert to Character ArrayList
         * int 1: convert to Integer ArrayList
         * int 2:
         **/
        if (convertTo == 0) {
            ArrayList<Character> cArrList = new ArrayList<>();

            for (char c : str.toCharArray()) {
                cArrList.add(c);
            }

            return cArrList;

        } else if (convertTo == 1) {
            // Assume String is in form of "[36, 40, 16]"
            String[] strReplace = str.replaceAll("//[|//]|", "").split(",");
            ArrayList<Integer> iArrList = new ArrayList<>();

            for (int i = 0; i < strReplace.length; ++i) {

            }
            return iArrList;
        }

        return null;

    }

    public static <T> ArrayList<?> intToArray(int n, int convertTo) {

        return null;
    }

    // From int / Integer
    // To String
    static String intToStr(int N) {
        String str = String.valueOf(N);
        return str;
    }

    // From char / Character
    // From String
    // To charArray
    static char[] strToCharArr(String str) {
        char[] cArr = new char[str.length()];

        try {
            cArr = strToCharArr(str);
        } catch (Exception e) {
            System.out.println("Error");
        }
        return cArr;
    }

    // To intArray
    static int[] strToIntArr(String str) {
        int[] iArr = new int[str.length()];
        try {
            iArr = strToIntArr(str);
        } catch (Exception e) {
            System.out.println("Given String consists letters");
        }

        return iArr;
    }

    // From double / Double
    // From boolean / Boolean...
    // From Arrays
    // From List & ArraysList

}
