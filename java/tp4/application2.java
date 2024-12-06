import java.util.Scanner;

public class application2 {
    public static void main(String[] args) {
        System.out.println("donner x");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 100 && x < 999) {
            System.out.println("afficher: "+x);
        }
        

        sc.close();    
    }
}
