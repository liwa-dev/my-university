import java.util.Scanner;

public class application3 {
    public static void main(String[] args) {
        System.out.println("donner x");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 0 && x < 9) {
            for (int i = 1; i < x+1; i++) {
                System.out.println(x+"*"+i+"="+x*i);
            }
        }
        sc.close();  }
}