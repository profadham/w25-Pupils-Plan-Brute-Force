import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Knapsack_Problem {
    static int n, W;
    static long[] v, w;
    static long ans = 0;

    static void solve(int i, long totalv, long totalw){
        if (i == n){
            if (totalw<=W){
                ans = Math.max(ans,totalv);
            }
            return;
        }
        //take
        solve(i+1, totalv+v[i], totalw+w[i]);
        //leave
        solve(i+1, totalv, totalw);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); W = sc.nextInt();
        v = new long[n];
        w = new long[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        solve(0, 0, 0);
        System.out.println(ans);
    }
}
