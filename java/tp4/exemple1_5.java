import java.util.Scanner;
public class exemple1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        do {
            System.out.println("x=" + x);
            x++;
        } while (x <= 10);
        sc.close();     }
}