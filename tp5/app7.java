public class app7 {
    public static void main(String[] args) {
        // Exemple de tableau initial
        int[] tableau = {1, 2, 3, 4, 5};
        int n = tableau.length;
        
        // Position de l'élément à supprimer
        int p = 3;   // position de suppression (1 <= p <= n)
        
        // Vérifier si la position est valide
        if (p < 1 || p > n) {
            System.out.println("Position invalide. La position doit être entre 1 et " + n);
            return;
        }
        
        // Créer un nouveau tableau de taille n-1
        int[] nouveauTableau = new int[n - 1];
        
        // Copier les éléments avant la position p
        for (int i = 0; i < p-1; i++) {
            nouveauTableau[i] = tableau[i];
        }
        
        // Copier les éléments après la position p
        for (int i = p; i < n; i++) {
            nouveauTableau[i-1] = tableau[i];
        }
        
        // Afficher le tableau original
        System.out.println("Tableau original:");
        afficherTableau(tableau);
        
        // Afficher le nouveau tableau
        System.out.println("\nTableau après suppression de l'élément à la position " + p + ":");
        afficherTableau(nouveauTableau);
    }
    
    // Méthode pour afficher un tableau
    public static void afficherTableau(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
}
