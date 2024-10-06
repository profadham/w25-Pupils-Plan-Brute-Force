import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Generating_Subsets_Iterative {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int mask = 0; mask < (1<<n); mask++) {
            ArrayList<Integer> subset = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask&(1<<i))>0)
                    subset.add(a[i]);
            }
            for (int i = 0; i < subset.size(); i++) {
                System.out.print(subset.get(i)+" ");
            }
            System.out.println();
        }
    }

}