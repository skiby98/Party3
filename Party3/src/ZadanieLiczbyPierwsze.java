import java.util.Scanner;

public class ZadanieLiczbyPierwsze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] tab = new int[n];

        for (int i=0; i < n; i++){
            tab[i] = scanner.nextInt();
        }

        for (int i=0; i < n; i++) {
            if (tab[i]>10) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }

        }
    }
}
