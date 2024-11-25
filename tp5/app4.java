import java.util.Scanner;

public class app4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("donner la taille de tableau");
        int  n;
        n=scanner.nextInt();
        while (n<=5){
            System.out.println("donner la taille >5 ");
            n=scanner.nextInt();

        }
        double[]tab=new double[n];
        for(int i=0;i<n;i++){
            System.out.println("donner les elements de tableau");
            tab[i]=scanner.nextDouble();
            
        }
        double a=tab[0];
        for(int i=1;i<n;i++){
            tab[i-1]=tab[i];
        }
        tab[n-1]=a;
        for(int i=0;i<n;i++){
            System.out.println(tab[i]);
        }

    }
}


