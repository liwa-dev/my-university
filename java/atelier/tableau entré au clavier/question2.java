import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] tab = new int[6];
        
        // Remplir le tableau
        for(int i = 0; i < 6; i++) {
            System.out.print("tab[" + i + "] = ");
            tab[i] = sc.nextInt();
        }
        
        // Chercher le plus grand
        int max = tab[0];
        for(int i = 1; i < 6; i++) {
            if(tab[i] > max) {
                max = tab[i];
            }
        }
        
        // Afficher le résultat
        System.out.println("Le plus grand element est: " + max);
        
    }
}
