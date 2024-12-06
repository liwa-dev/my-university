import java.util.Scanner;

public class EX5 {
    public static void main (String[] args){
     Scanner input=new Scanner(System.in);
     System.out.println("donne a");
     int a=input.nextInt();
     if(a>0){
        System.out.println(a);
     }
     else{
        System.out.println(-1*a);
     }


}}
