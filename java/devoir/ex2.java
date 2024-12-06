import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Saisir la taille du tableau (n ≤ 10) : ");
            n = sc.nextInt();
        } while (n <= 0 || n > 10);

        char[] e = new char[n]; // nomber etages
        int[] p = new int[n]; //nomber de personne

        System.out.println("Remplir les numéros des étages :");
        for (int i = 0; i < n; i++) {
            System.out.print("Numéro de l'étage " + (i+1) + " : ");
            e[i] = sc.next().charAt(0);
        }

        System.out.println("Remplir les prix des étages");
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Prix de l'étage " + e[i] + " : ");
                p[i] = sc.nextInt();
            } while (p[i] < 10 || p[i] > 60);
        }

        System.out.println("\n**************** Menu ****************");
        for (int i = 0; i < n; i++) {
            System.out.println("     Étape " + e[i] + " | Prix: " + p[i] + " Dinars");
        }
        System.out.println("************* Profitez-vous *************");

        int choix;
        do {
            System.out.print("Saisir votre choix (entre 0 et " + (n-1)+") : ");
            choix = sc.nextInt();
        } while (choix < 0 || choix >= n);

        System.out.println("Vous avez choisi l'étape " + e[choix] + ":");
        System.out.println("Prix de location : " + p[choix] + " Dinars");

        int pa; // nombre de personne
        do {
            System.out.print("Saisir le nombre de personne (entre 1 et 5) : ");
            pa = sc.nextInt();
        } while (pa < 1 || pa > 5);

        int map = p[choix] * pa;
        System.out.println("Montant à payer : " + map + " Dinars");

        int mv; // montant à payer
        do {
            System.out.print("Entrer le montant en billets d'argent : ");
            mv = sc.nextInt();
            if (mv < map) {
                System.out.println("Solde insuffisant !");
            } else {
                int reste = mv - map;
                System.out.println("Merci, votre reste est : " + reste + " Dinars");
            }
        } while (mv < map);

        int mp = p[0];
        int im = 0;
        for (int i = 1; i < n; i++) {
            if (p[i] > mp) {
                mp = p[i];
                im = i;
            }
        }

        System.out.println("L'étage le plus cher est : " + e[im] + " avec un prix de " + mp + " Dinars");
    }
}
