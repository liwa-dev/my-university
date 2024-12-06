import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] tab = new int[6];
        
        // Remplir le tableau
        for(int i = 0; i < 6; i++) {
            System.out.println("tab[" + i + "] = ");
            tab[i] = sc.nextInt();
        }
        
        // Afficher le tableau
        System.out.print("Le tableau: ");
        for(int i = 0; i < 6; i++) {
            System.out.print(tab[i] + " ");
        }
        
    }
}
