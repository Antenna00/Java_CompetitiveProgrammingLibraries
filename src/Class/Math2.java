package Class;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

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
    
    // 約数列挙 ソート導入
    public static <T> ArrayList<?> divisorList(T N) {
        ArrayList<Long> arr = new ArrayList<>();
        long n = Long.parseLong(N.toString());

        for (long i = 1; i * i <= n; ++i) {
            if (n % i != 0)
                arr.add(i);
            if (i != n / i)
                arr.add(n / i);
        }
        Collections.sort(arr);
        return arr;
    }

    // エラトステネスのふるい 素数列挙
    public static <T> Vector<?> eratosthenesPrimeList(T N, boolean greater) {

        long n = (long) N;
        Vector<Long> vec = new Vector<>();
        Vector<Boolean> vprime = new Vector<>();
        vprime.setSize((int) n + 1);

        // 全てにTrueを設定。Javaでは初期化時に設定できない模様。糞仕様である。
        // for (int o = 0; o < vprime.size(); ++o) {
        // //.addだと最後の値がシフトされる
        // vprime.add(o, true);
        // }
        // Collections.replaceAll(vprime, false, true);
        Collections.fill(vprime, true);

        for (int i = 2; i * i <= n; ++i) {
            // xの倍数のindexをfalseに置換
            if (vprime.get(i) == true) {
                for (int x = 2 * i; x <= n; x += i)
                    vprime.set(x, false);
            }
        }

        if (greater) {
            for (long j = 2; j <= n; ++j) {
                // forloop内でキャストしたくない・・・。
                // 後の改善ポイント？ただ素数がint範囲以上の場合もあるのでとりあえず妥協。
                if (vprime.get((int) j))
                    vec.add(j);
            }
            Collections.sort(vec); // 昇順設定 ここも早くするなら自分でUtility書いたほうがいい。改善ポイント。
        } else {
            for (long k = 2; k <= n; ++k) { // これ記述量減らせるんでは。
                if (vprime.get((int) k))
                    vec.add(k);
            }
            Collections.sort(vec);
            Collections.reverse(vec); // 降順に変更
        }

        return vec;
    }
   
    // モンテカルロ法
    public static <T> void monteCarloPi(T N) {
        long n = Long.parseLong(N.toString());
        int count = 0;

        for (int i = 1; i <= n; ++i) {
            double px = Math.random();
            double py = Math.random();

            if (px * px + py * py <= 1.0)
                count += 1;
        }
        System.out.printf("%.12f\n", 4.0 * count / n);
    }

    // ユークリッド互除法 （最大公約数） ２桁ver O(log (A + B))
    public static <T> long eucrid(T A, T B) {
        int a = (int) A;
        int b = (int) B;

        while (a >= 1 && b >= 1) {
            if (a < b)
                b = b % a;
            else
                a = a % b;
        }
        if (a >= 1)
            return a;
        return b;
    }

    // ユークリッド互除法（最大公約数） ３桁ver
    public static <T> long eucrid(T A, T B, T C) {

        return 0;
    }
}

// N オブジェクト丸々コピーして別のアドレスへ割り当て
// &&N 右辺値参照：値渡し：上書きされない
// &N 左辺値参照：同じアドレス先を参照して渡す：上書きされる
// "*N" 左辺値参照とやっていることは同じだが、存在しないポインタを指してしまう可能性があるため左辺値参照水晶：上書きされる
