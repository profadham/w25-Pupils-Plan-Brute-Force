import java.io.IOException;
import java.util.Scanner;

public class Knapsack_nonvoid {
    static int n, W;
    static long[] v, w;
    static long solve(int i, long totalv, long totalw){
        if (i==n){
            return totalv;
        }
        long res = solve(i+1, totalv, totalw); //leave

        if (totalw+w[i]<=W){ //I have enough capacity to take this item
            res = Math.max(res, solve(i+1, totalv+v[i], totalw+w[i]));//take
        }
        return res;
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
        System.out.println(solve(0, 0, 0));
    }

}
