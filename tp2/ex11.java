

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        System.out.print("Entrez votre âge : ");
        int age = sc.nextInt();
        if (age >= 6 && age <= 7) {
            System.out.println("Vous êtes dans la catégorie : Gamin");
        } else if (age >= 8 && age <= 9) {
            System.out.println("Vous êtes dans la catégorie : Pupille");
        } else if (age >= 10 && age <= 11) {
            System.out.println("Vous êtes dans la catégorie : Jeune");
        } else if (age >= 12) {
            System.out.println("Vous êtes dans la catégorie : Cadet");
        } else {
            System.out.println("Âge non pris en compte pour une catégorie.");
        }
        sc.close();

	}

}
