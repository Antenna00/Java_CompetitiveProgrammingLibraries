import java.io.PrintWriter;
import java.util.Scanner;

import Class.FastScanner;
import Class.Utility;

public class CompProgramming {
    public static void main(String[] args) throws Exception {
        // FastScanner fsc = new FastScanner();
        // int N = fsc.nextInt();
        // System.out.println(N);
        int n = 100;
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = Math.random();
        }
        double t = -3;

        String result = Utility.doublePrint(t, n);
        System.out.println(result);

        String Test = "Test";
        String Temp = Utility.concatString2(Test, 4);
        System.out.println(Temp);

        String o = "あ";

        String cv = o;
        o = "い";

        System.out.println(o + " " + cv);
        // Faster Way of printing
        // String WriterTest = "Testssss";
        // PrintWriter out = new PrintWriter(System.out);
        // out.println(WriterTest);
        // out.flush();

    }
}
