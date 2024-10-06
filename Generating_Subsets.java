import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Generating_Subsets {
    static int n;
    static int[] a;
    static ArrayList<Integer> subset;

    static void generate(int i){
        if (i==n){
            for (int j = 0; j < subset.size(); j++){
                System.out.print(subset.get(j)+" ");
            }
            System.out.println();
            return;
        }

        subset.add(a[i]);
        generate(i+1);
        subset.remove(subset.size()-1);

        generate(i+1);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        subset = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        generate(0);
    }

}
