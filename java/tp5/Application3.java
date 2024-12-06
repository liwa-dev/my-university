import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("donnner n:"); 
        n=sc.nextInt();
        while (n<=0) {
            System.out.println("N doit étre positive: ");
            n=sc.nextInt();
        }
        int[] tableau= new int[n];
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("donner le element " + i + "de tableau :");
            tableau[i] = sc.nextInt();
        }
        int x;
        System.out.println("Donner x:");
        x = sc.nextInt();
        int noc=0;

        for (int i = 0; i < tableau.length; i++) {

            if (tableau[i] == x) {
                noc++;
            }
        }
        if (noc == 0) { 
            System.out.println("x n'exist pas dans le tableau");
        } else {
            System.out.println(noc);
        }


    }
}