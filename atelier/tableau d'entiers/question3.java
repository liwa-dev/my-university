import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        int[] tableau = {12, 5, 8, 9, 12, 3, 7, 5, 14, 5};
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entrez un nombre à rechercher : ");
        int nombreRecherche = sc.nextInt();
        boolean rep=false;
        // int dernierIndice = -1;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == nombreRecherche) {
                rep=true;
                // dernierIndice = i;
                System.out.println(i);                
                break;                                                                                                                                                                                                          
            }
        }
        System.out.println(rep);

        
      
        sc.close();
    }
}