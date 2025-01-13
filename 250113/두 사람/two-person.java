import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Aage = sc.nextInt();
        String Asex = sc.next();
        int Bage = sc.nextInt();
        String Bsex = sc.next();

        if((Aage >= 19 && Asex.equals("M")) || (Bage >= 19 && Bsex.equals("M"))){
            System.out.println(1);
        } else System.out.println(0);
    }
}