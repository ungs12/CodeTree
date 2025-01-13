import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        if(first >= 90 && second >= 95) System.out.println(100000);
        else if(first >= 90 && second >= 90) System.out.println(50000);
        else System.out.println(0);
    }
}