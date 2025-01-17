import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for(int i = 1; i < n; i++){
           if(n % i == 0){
            res += i;
           } 
        }

        if(res == n){
            System.out.println("P");
        } else System.out.println("N");
        
    }
}