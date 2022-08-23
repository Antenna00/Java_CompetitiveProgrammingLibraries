package Class;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Note {

    public static void test() throws IOException {
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        String t = Double.toString(12324.134);

        String result = nf.format(t);

        System.out.println(result);
    }
}
