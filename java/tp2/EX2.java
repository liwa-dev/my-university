import java.util.Scanner;

public class EX2 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("donne a");
       
        int a=input.nextInt();
        System.out.println("donne b");
       
        int b=input.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        if(b==0){
            System.out.println("erreur");
        }
        else{
        System.out.println(a/b);

        }
    }

}
