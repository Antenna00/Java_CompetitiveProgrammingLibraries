package Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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

    // Array Translation from [Integer]
    public static <T> List<?> intToArray(int n, int convertTo) {
        /**
         * int 0: convert to Character ArrayList
         * int 1: convert to Integer ArrayList
         * int 2: convert to String ArrayList
         **/
        if (convertTo == 0) {
            // Assume int is 1234...n -> ['1', '2', '3', '4'...n]
            String str = Integer.toString(n);
            List<Character> cArr = new ArrayList<>(str.length());
            for (char c : str.toCharArray()) {
                cArr.add(c);
            }
            return cArr;

        } else if (convertTo == 1) {
            // Assume int is 1234...n -> [1, 2, 3, 4...n]
            String str = Integer.toString(n);
            String[] str2 = str.split("");
            int[] arr = Arrays.stream(str2)
                    .mapToInt(Integer::parseInt)
                    .toArray();

            List<Integer> iArr = new ArrayList<>(str.length());

            for (int s : arr) {
                iArr.add(s);
            }

            return iArr;

        } else if (convertTo == 2) {
            // Assume int is 1234...n -> ["12", "34"...n]

            int numDigit = 5;
            int indexA = 0;
            int indexB = 0;

            String str = Integer.toString(n);
            String[] str2 = str.split("");

            ArrayList<String> sArr = new ArrayList<>();

            for (int i = 0; i < str.length(); i += numDigit) {

                try {
                    indexB = i + 1;

                    sArr.add(str2[i]);

                    for (int j = 0; j < numDigit - 1; j++) {
                        sArr.set(indexA, sArr.get(indexA) + str2[indexB]);
                        indexB++;
                    }

                    indexA++;

                } catch (Exception Ignored) {
                }
                ;

            }
        }

        return null;

    }

    // Array Translation from [char ArrayList]
    public static <T> ArrayList<?> cArrToArray(ArrayList<Character> c, int convertTo) {

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
