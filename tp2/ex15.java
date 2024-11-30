
import java.util.*;
public class ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entrer la moyenne : ");
		float moy = sc.nextFloat();
		if (moy >=10 && moy < 12) {
			System.out.println("l'étudiant est passable ");
		}
		else if (moy >=12 && moy < 14) {
			System.out.println("l'étudiant est assez bien ");
		}
		else if (moy >=14 && moy < 16) {
			System.out.println("l'étudiant est Bien ");
		}
		else if (moy >=16 && moy < 18) {
			System.out.println("l'étudiant est trés bien ");
		}
		else if (moy >=18 && moy <= 20) {
			System.out.println("l'étudiant est Excellent ");
		}
		sc.close();
		

	}

}
