import java.util.Scanner;

public class EX8 {
    public static void main (String[] args){
     Scanner input=new Scanner(System.in);
     double d=0;
     for(int i=0;i<3;i++){
        System.out.println("donne a");
        int a1=input.nextInt();
        System.out.println("donne a");
        int a2=input.nextInt();
        d=d+(a1*a2);


     }
     if(d/3>=10){
        System.out.println("valide");
     }
     else{
        System.out.println("refuse");
     }



}}
