import java.util.Scanner;

public class EX10 {
    public static void main (String[] args){
     Scanner input=new Scanner(System.in);
     System.out.println("donne a");
     char a=input.next().charAt(0);
     int a1=a;
     if(a1<=91 & 65>=a){
        System.out.println(" a est majuscules");
     }
     else if(97<=a1 & a1<=122){
        System.out.println(" a est minuscule");
     }
     else{
        System.out.println(" a est un caractère non alphabétique. ");
     }

}}
