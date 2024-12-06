import java.util.Scanner;

public class application1 {
    public static void main(String[] args) {
        System.out.println("donner x");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 0) {
            int s  =( x*x);
            System.out.println("le carre de:  "+x+"   est egale =  "+s);
    
        }
       
        sc.close();   }
}
