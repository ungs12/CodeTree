import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while(3*i <= n){
            System.out.print(3*i + " ");
            i++;    
        }
    }
}