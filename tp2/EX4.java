import java.util.Scanner;

public class EX4 {
     public static void main (String[] args){
     Scanner input=new Scanner(System.in);
     System.out.println("donne a");
     int a=input.nextInt();
     System.out.println("donne b");
     int b=input.nextInt();
     if((a>0 & b>0)||(a<0 & b<0)){
        System.out.println("signe de produit est (+)");


     }
     else if((a<0 & b>0)||(a<0 & b>0)){
        System.out.println("signe de produit est (-)");


     }
     else{
        System.out.println(" produit est null");
     }

}}
