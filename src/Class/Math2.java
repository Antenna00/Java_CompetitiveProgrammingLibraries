package Class;

import java.util.ArrayList;

public class Math2 {

    // 素数判定
    public static <T> boolean isPrime(T N) {
        long n = Long.parseLong(N.toString());

        for (int i = 2; i * i <= n; ++i) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // 約数列挙
    public static <T> ArrayList<T> divisorList(T N) {
        ArrayList<Integer> arr = new ArrayList<>();
        long n = Long.parseLong(N.toString());

        for (long i = 1; i * i <= n; ++i) {
            if (n % i != 0) {

            }

        }

        return null;
    }

}

// N オブジェクト丸々コピーして別のアドレスへ割り当て
// &&N 右辺値参照：値渡し：上書きされない
// &N 左辺値参照：同じアドレス先を参照して渡す：上書きされる
// "*N" 左辺値参照とやっていることは同じだが、存在しないポインタを指してしまう可能性があるため左辺値参照水晶：上書きされる
