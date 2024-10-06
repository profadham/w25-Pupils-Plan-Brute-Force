import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Generating_Permutations {
    static int n;
    static boolean[] taken;
    static ArrayList<Integer> perm;

    static void generate(int i){
        if (i==n){
            for (int j = 0; j < perm.size(); j++){
                System.out.print(perm.get(j)+" ");
            }
            System.out.println();
            return;
        }

        for (int j = 1; j <= n; j++){
            if (taken[j]) continue;

            taken[j] = true;
            perm.add(j);
            generate(i+1);
            taken[j] = false;
            perm.remove(perm.size()-1);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        perm = new ArrayList<>();
        taken = new boolean[n+1];
        generate(0);
    }

}
