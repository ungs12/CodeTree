import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        int a = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("010" + "-" + y + "-" + x);
    }
}