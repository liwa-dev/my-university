public class app5 {
    public static void main(String[] args) {
        // Exemple de tableau initial
        int[] T = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // Compter le nombre de valeurs paires et impaires
        int nbPairs = 0;
        int nbImpairs = 0;
        for (int num : T) {
            if (num % 2 == 0) {
                nbPairs++;
            } else {
                nbImpairs++;
            }
        }
        
        // Créer les tableaux T1 (pairs) et T2 (impairs)
        int[] T1 = new int[nbPairs];
        int[] T2 = new int[nbImpairs];
        
        // Indices pour remplir T1 et T2
        int indexPair = 0;
        int indexImpair = 0;
        
        // Remplir les tableaux T1 et T2
        for (int num : T) {
            if (num % 2 == 0) {
                T1[indexPair] = num;
                indexPair++;
            } else {
                T2[indexImpair] = num;
                indexImpair++;
            }
        }
        
        // Afficher les résultats
        System.out.println("Tableau original:");
        afficherTableau(T);
        
        System.out.println("\nTableau des nombres pairs (T1):");
        afficherTableau(T1);
        
        System.out.println("\nTableau des nombres impairs (T2):");
        afficherTableau(T2);
    }
    
    // Méthode pour afficher un tableau
    public static void afficherTableau(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
}