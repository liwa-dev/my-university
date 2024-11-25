import java.util.Scanner;


class app1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("donnner n:"); 

        int n=0;
        while (n<=0) {
            n=sc.nextInt();
        }
        int[] t = new int[n];
        for (int i = 0; i < t.length; i++) {
            System.out.println("Donner des entiers composes de deux chiffres");
            int nb=sc.nextInt();
            while (nb<10 || nb>99) {
                System.out.println("Donner des entiers composes de deux chiffres");
                nb=sc.nextInt();
            }
            t[i]=nb;

        }
        
        System.out.println("Affichage du tableau");
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i]+"|");
        }
        
        
    }
}