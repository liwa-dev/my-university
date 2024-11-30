import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Saisir la dimension des vecteurs
        System.out.print("Donner la dimension des vecteurs: ");
        int n = sc.nextInt();
        
        int[] u = new int[n];
        int[] v = new int[n];
        
        // Saisir U
        System.out.println("Saisir U:");
        for(int i = 0; i < n; i++) {
            System.out.print("U[" + i + "] = ");
            u[i] = sc.nextInt();
        }
        
        // Saisir V
        System.out.println("Saisir V:");
        for(int i = 0; i < n; i++) {
            System.out.print("V[" + i + "] = ");
            v[i] = sc.nextInt();
        }
        
        // Calculer le produit scalaire
        int ps = 0;
        for(int i = 0; i < n; i++) {
            ps = ps + (u[i] * v[i]);
        }
        
        // Afficher le résultat
        System.out.print("(");
        for(int i = 0; i < n; i++) {
            System.out.print(u[i]);
            if(i < n-1) System.out.print(" ");
        }
        System.out.print(") * (");
        for(int i = 0; i < n; i++) {
            System.out.print(v[i]);
            if(i < n-1) System.out.print(" ");
        }
        System.out.println(") = " + ps);
        
    }
}
