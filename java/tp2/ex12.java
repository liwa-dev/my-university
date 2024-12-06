

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("entrer un numéro ");
		int num_Mois = sc.nextInt();
        switch (num_Mois) {
            case 1:
                System.out.println("Le mois correspondant est : Janvier");
                break;
            case 2:
                System.out.println("Le mois correspondant est : Février");
                break;
            case 3:
                System.out.println("Le mois correspondant est : Mars");
                break;
            case 4:
                System.out.println("Le mois correspondant est : Avril");
                break;
            case 5:
                System.out.println("Le mois correspondant est : Mai");
                break;
            case 6:
                System.out.println("Le mois correspondant est : Juin");
                break;
            case 7:
                System.out.println("Le mois correspondant est : Juillet");
                break;
            case 8:
                System.out.println("Le mois correspondant est : Août");
                break;
            case 9:
                System.out.println("Le mois correspondant est : Septembre");
                break;
            case 10:
                System.out.println("Le mois correspondant est : Octobre");
                break;
            case 11:
                System.out.println("Le mois correspondant est : Novembre");
                break;
            case 12:
                System.out.println("Le mois correspondant est : Décembre");
                break;
            default:
                System.out.println("Numéro de mois invalide. Veuillez entrer un numéro entre 1 et 12.");
                break;
        }
        sc.close();

	}

}
