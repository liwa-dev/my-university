import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        int[] tab = {12, 5, 8, 9, 12, 3, 7, 5, 14, 5};
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entrez un nombre à rechercher : ");
        int nombreRecherche = sc.nextInt();
        
        int dernierIndice = -1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == nombreRecherche) {
                dernierIndice = i;
            }
        }
        
        // Afficher le résultat
        if (dernierIndice != -1) {
            System.out.println("Le nombre " + nombreRecherche + " a été trouvé à l'indice " + dernierIndice);
        } else {
            System.out.println("Le nombre " + nombreRecherche + " n'existe pas dans le tableau");
        }
        
        // Fermer le sc
        sc.close();
    }
}