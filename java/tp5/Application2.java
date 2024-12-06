import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        // Lecture de la taille du tableau
        do {
            System.out.print("Entrez la taille du tableau (n > 0): ");
            n = scanner.nextInt();
        } while (n <= 0);
        
        // Création et remplissage du tableau
        int[] tableau = new int[n];
        System.out.println("Remplissez le tableau avec " + n + " entiers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Entrez l'élément " + (i+1) + ": ");
            tableau[i] = scanner.nextInt();
        }
        
        // Calcul de la somme des nombres impairs
        int sommeImpairs = 0;
        for (int nombre : tableau) {
            if (nombre % 2 != 0) {  // Si le nombre est impair
                sommeImpairs += nombre;
            }
        }
        
        // Affichage du résultat
        System.out.println("La somme des nombres impairs est: " + sommeImpairs);
        
        scanner.close();
    }
}