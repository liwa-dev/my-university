import java.util.Scanner;
public class EX {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.println("donne nh");
       
        int nh=input.nextInt();
        System.out.println("donne th");
       
        int th=input.nextInt();
        System.out.println("donne anc");
       
        int anc=input.nextInt();
        int s=th*nh;
        if(anc<10){
            s=s+95;
        }
        System.out.println("votre salaire est"+s);
    }
}
