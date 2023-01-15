import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    int val[] = new int[T];

        for (int s = 0; s < T; s++) {
            int V = sc.nextInt();
            int S = sc.nextInt();
            val[s] = V + S;
        }
        sc.close();

        for(int k : val) {
            System.out.println(k);
        }
    }
}