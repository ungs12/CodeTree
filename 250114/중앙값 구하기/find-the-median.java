import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;

        if(max < b) max = b;
        if(max < c) max = c;

        if(max == a){
            if(b < c) System.out.println(c);
            else System.out.println(b);
        } else if(max == b) {
            if(a < c) System.out.println(c);
            else System.out.println(a);
        } else{
            if(a < b) System.out.println(b);
            else System.out.println(a);
        }
    }
}