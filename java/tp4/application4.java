import java.util.Scanner;

public class application4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;
        for (int i = 1; i < n+1; i++) {
            f = f * i;
        }
        System.out.println(f);
   sc.close(); }
}
