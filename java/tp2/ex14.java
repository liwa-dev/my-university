

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("entrer le nombre des enfants ");
		int nb = sc.nextInt();
		switch (nb) {
		case 0 : 
			 System.out.println("Montant en DT est 0dt ");
			 break ;
		 case 1 : 
			 System.out.println("Montant en DT est 50dt ");
			 break ;
		 case 2 : 
			 System.out.println("Montant en DT est 90dt ");
			 break ;
		 case 3 : 
			 System.out.println("Montant en DT est 140dt ");
			 break ;
		 case 4 : 
			 System.out.println("Montant en DT est 185dt ");
			 break ;
		 case 5 : 
			 System.out.println("Montant en DT est 246dt ");
			 break ;
		 case 6 : 
			 System.out.println("Montant en DT est 287dt ");
			 break ;
		 case 7 : 
			 System.out.println("Montant en DT est 312dt ");
			 break ;
		 default:
             System.out.println("Nombre des enfants invalides. Veuillez entrer un numéro entre 0 et 7.");
             break;
			 
		}
		sc.close();

	}

}
