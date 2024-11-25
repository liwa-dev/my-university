import java.util.Scanner;

public class application5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("donner n: ");
        int n = sc.nextInt();
        int s=0;
        for (int i = 1; i < n; i++) {
            if (n % i==0) {
            s+=i;
            }
        }
        if (s==n) {
            System.out.println("le nomber est parfait");
        } else {
            System.out.println("le nomber est non parfait");
        }
        sc.close();
    }

}
