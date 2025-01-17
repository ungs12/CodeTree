import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = n - i; j > 1; j--){
                System.out.print("  ");
            }
            
            for(int k = n; k > (n - i) - 1; k--){
                System.out.print("@ ");
            }
            System.out.println();
        }

        for(int o = 0; o < n; o++){
            for(int z = 0; z < (n - 1) - o; z++){
                System.out.print("@ ");
            }

            for(int g = n; g > (n - o) - 1; g--){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}