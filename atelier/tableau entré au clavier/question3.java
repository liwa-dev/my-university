import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] tab = new int[6];
        
        // Remplir le tableau
        for(int i = 0; i < 6; i++) {
            System.out.print("tab[" + i + "] = ");
            tab[i] = sc.nextInt();
        }
        
        // Calculer la somme
        int s = 0;
        for(int i = 0; i < 6; i++) {
            s = s + tab[i];
        }
        
        // Calculer et afficher la moyenne
        double moy = (double)s / 6;
        System.out.println("La moyenne est: " + moy);
            }
}
