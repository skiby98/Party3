import java.util.Scanner;

public class ZadanieLiczbyPierwszeTlumaczenie {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe n: ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] t = new int[n];

        for (int i=0; i < n; i++){
            System.out.println("Podaj liczbe " + i +": " );
            t[i] = scanner.nextInt();
        }

        for (int i=0; i < n; i++) {
            System.out.println(t[i]);
        }
    }
}
