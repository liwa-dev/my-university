import java.util.Scanner;

public class EX3 {
    public static void main (String[] args){
    Scanner input=new Scanner(System.in);
        System.out.println("donne a");
        int a=input.nextInt();
       
        
        if(a>=10 & a<=20){
            System.out.println("valide");
        }
        else if(a<10 & a>=0){
            System.out.println("non valide");

        }
        else{
            System.out.println("0<=note<=20");
        }

}}
