import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int f = 0; f < n; f++){
            for(int i = 0; i < n - f; i++){
                for(int j = 0; j < n - f; j++){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}