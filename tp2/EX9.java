import java.util.Scanner;

public class EX9 {
    public static void main (String[] args){
     Scanner input=new Scanner(System.in);
     System.out.println("donne a");
     double a1=input.nextDouble();
     System.out.println("donne b");
     double a2=input.nextDouble();
     if(a1==0){
        System.out.println("ne pas des solution");

     }
     else if(a2==0){
        System.out.println("x==0");
     }
     else{
        double a=(-a2)/a1;
        System.out.println("x=="+a);
     }


}}
