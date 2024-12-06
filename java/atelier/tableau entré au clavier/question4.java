import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Saisir la taille
        System.out.print("Donner n: ");
        int n = sc.nextInt();
        
        // Créer le tableau de taille n
        char[] tab = new char[n];
        
        // Vider le buffer
        sc.nextLine();
        
        // Remplir le tableau
        for(int i = 0; i < n; i++) {
            System.out.print("tab[" + i + "] = ");
            tab[i] = sc.nextLine().charAt(0);
        }
        
        // Afficher le tableau
        System.out.print("Le tableau: ");
        for(int i = 0; i < n; i++) {
            System.out.print(tab[i] + " ");
        }
        
    }
}
