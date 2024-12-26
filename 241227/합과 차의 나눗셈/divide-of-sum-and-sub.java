import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a + b;
        int y = a - b;
        double res = (double)x / y;
        System.out.printf("%.2f", res);
    }
}