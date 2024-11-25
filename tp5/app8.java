import java.util.Scanner;

public class app8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Demander la taille du tableau (minimum 10)
        int n;
        do {
            System.out.print("Entrez le nombre d'étudiants (minimum 10): ");
            n = scanner.nextInt();
            if (n < 10) {
                System.out.println("Le nombre d'étudiants doit être au moins 10!");
            }
        } while (n < 10);
        
        // Créer le tableau pour stocker les notes
        double[] notes = new double[n];
        
        // Saisie des notes
        double somme = 0;
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Entrez la note de l'étudiant " + (i+1) + " (entre 0 et 20): ");
                notes[i] = scanner.nextDouble();
                if (notes[i] < 0 || notes[i] > 20) {
                    System.out.println("La note doit être entre 0 et 20!");
                }
            } while (notes[i] < 0 || notes[i] > 20);
            
            somme += notes[i];
        }
        
        // Calculer la moyenne
        double moyenne = somme / n;
        
        // Compter les notes supérieures à la moyenne
        int nombreNotesSupMoyenne = 0;
        for (int i = 0; i < n; i++) {
            if (notes[i] > moyenne) {
                nombreNotesSupMoyenne++;
            }
        }
        
        // Afficher les résultats
        System.out.println("\nRésultats:");
        System.out.println("Moyenne de la classe: " + String.format("%.2f", moyenne));
        System.out.println("Nombre de notes supérieures à la moyenne: " + nombreNotesSupMoyenne);
        
        // Afficher toutes les notes
        System.out.println("\nListe des notes:");
        for (int i = 0; i < n; i++) {
            System.out.println("Étudiant " + (i+1) + ": " + notes[i]);
        }
        
        scanner.close();
    }
}
