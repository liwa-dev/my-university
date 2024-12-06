import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Saisir la taille des tableaux
        System.out.print("Donner la taille des tableaux: ");
        int n = sc.nextInt();
        
        int[] t1 = new int[n];
        int[] t2 = new int[n];
        
        // Saisir T1
        System.out.println("Saisir T1:");
        for(int i = 0; i < n; i++) {
            System.out.print("T1[" + i + "] = ");
            t1[i] = sc.nextInt();
        }
        
        // Saisir T2
        System.out.println("Saisir T2:");
        for(int i = 0; i < n; i++) {
            System.out.print("T2[" + i + "] = ");
            t2[i] = sc.nextInt();
        }
        
        // Vérifier si les tableaux sont égaux
        boolean egaux = true;
        for(int i = 0; i < n; i++) {
            if(t1[i] != t2[i]) {
                egaux = false;
                break;
            }
        }
        
        // Afficher le résultat
        if(egaux) {
            System.out.println("Les tableaux sont egaux");
        } else {
            System.out.println("Les tableaux ne sont pas egaux");
        }
        
    }
}
