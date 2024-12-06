import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        int[] tab = {1, 5, 8, 12, 15, 20, 25, 30};
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entrez un nombre entier à rechercher : ");
        int nr = sc.nextInt();
        
        boolean trouve = false;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == nr) {
                trouve = true;
                break;
            }
        }
        
        // Affichage du résultat
        if (trouve) {
            System.out.println("Oui, le nombre " + nr + " est dans le tableau.");
        } else {
            System.out.println("Non, le nombre " + nr + " n'est pas dans le tableau.");
        }
        
        sc.close();
    }
}