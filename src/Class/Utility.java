package Class;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;
import java.math.BigInteger;

//ユーティリティライブラリ
public class Utility {

    // 文字列結合（繰り返し）
    public static String concatString(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static <T> String concatString2(T str, T N) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < (Integer) N; ++i) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static String replaceString(String str, String repStr, int n, int s) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return null;
    }

    // doubleを指定桁で出力用 printfでは低速のため 自前で用意
    public static String doublePrint(double x, int n) {
        StringBuilder sb = new StringBuilder();
        if (x < 0) {
            sb.append('-');
            x = -x;
        }
        x += Math.pow(10, -n) / 2;
        sb.append((long) x);
        sb.append(".");
        x -= (long) x;
        for (int i = 0; i < n; ++i) {
            x *= 10;
            sb.append((int) x);
            x -= (int) x;
        }
        return sb.toString();
    }

    public static <T> T modulo100(T N) {

        return null;
    }

    // 回帰型ー階乗 //引数はBigIntegerのため注意。またBigIntegerはStringしか受け付けない仕様
    public static <T> BigInteger factorial(BigInteger N) {
        if (N.longValue() == 0) {
            return new BigInteger("1");
        }

        return N.multiply(factorial(N.subtract(new BigInteger("1"))));
    }
}
