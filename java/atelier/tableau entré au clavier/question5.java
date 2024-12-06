import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] tab = new char[10];
        
        // Saisir les caractères
        for(int i = 0; i < 10; i++) {
            System.out.print("tab[" + i + "] = ");
            tab[i] = sc.nextLine().charAt(0);
        }
        
        // Compter les majuscules et les lettres
        int nbMaj = 0;
        int nbLet = 0;
        
        for(int i = 0; i < 10; i++) {
            // Vérifier si c'est une majuscule
            if(tab[i] >= 'A' && tab[i] <= 'Z') {
                nbMaj++;
                nbLet++;
            }
            // Vérifier si c'est une minuscule
            else if(tab[i] >= 'a' && tab[i] <= 'z') {
                nbLet++;
            }
        }
        
        // Afficher les résultats
        System.out.println("Nombre de majuscules: " + nbMaj);
        System.out.println("Nombre de lettres: " + nbLet);
        
    }
}
