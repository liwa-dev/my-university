import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] tab = {1, 2, 3, 4, 5};
        
        System.out.print("Le tableau avant : ");
        for(int j = 0; j < tab.length; j++) {
            System.out.print(tab[j] + " ");
        }
        System.out.println();
        
        System.out.print("Donner i1: ");
        int i1 = sc.nextInt();
        System.out.print("Donner i2: ");
        int i2 = sc.nextInt();
        
        if(i1 >= 0 && i1 < tab.length && i2 >= 0 && i2 < tab.length) {
            int x = tab[i1];
            tab[i1] = tab[i2];
            tab[i2] = x;
            
            System.out.print("Le tableau apres: ");
            for(int j = 0; j < tab.length; j++) {
                System.out.print(tab[j] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Erreur! i1 et i2 doivent etre entre 0 et " + (tab.length-1));
        }
        
        sc.close();
    }
}
