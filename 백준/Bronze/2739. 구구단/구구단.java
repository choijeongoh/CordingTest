import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        int V = I.nextInt();
        I.close();

        for (int S = 1; S < 10; S++) {
            int val = V * S;
            System.out.println( V+" * "+ S +" = "+val );
        }
    }
}