import java.util.Scanner;

public class EX7 {
    public static void main (String[] args){
     Scanner input=new Scanner(System.in);
     System.out.println("donne a");
     int a=input.nextInt();
     int a1=a%10;
     if(a%a1==0){
        System.out.println(" a devosible par a1");

     }
     else{
        System.out.println(" a ne pas devisible par a1");
     }
     


}}
