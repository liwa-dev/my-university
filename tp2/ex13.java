

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("entrer le HBA1c : ");
		float hba1c = sc.nextFloat();
		if (hba1c >= 4.0 && hba1c <= 6.0) {
            System.out.println("L'état du patient est : Excellent");
        } else if (hba1c >= 7.0 && hba1c <= 8.0) {
            System.out.println("L'état du patient est : Bon");
        } else if (hba1c >= 9.0 && hba1c <= 14.0 ) {
            System.out.println("L'état du patient est : Mauvais");
        } else {
            System.out.println("Valeur de HBA1c invalide.");
        }
		sc.close();

	}

}
