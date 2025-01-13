import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        String a_state = sc.next();
        int a_temp = sc.nextInt();

        String b_state = sc.next();
        int b_temp = sc.nextInt();

        String c_state = sc.next();
        int c_temp = sc.nextInt();

        if(a_state.equals("Y") && a_temp >= 37) count ++;
        if(b_state.equals("Y") && b_temp >= 37) count ++;
        if(c_state.equals("Y") && c_temp >= 37) count ++;

        if(count >= 2) System.out.println("E");
        else System.out.println("N");

    }
}