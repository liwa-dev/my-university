import java.util.Scanner;

public class application6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un n : ");
        int n = sc.nextInt();
        boolean premier = true;

        if (n >= 1) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                   premier = false;
                }
            }
        }

        if (premier) {
            System.out.println(n + " est un n premier.");
        } else {
            System.out.println(n + " n'est pas un n premier.");
        }
        sc.close();

    }
}
