public class Main {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        a = a + b + c;
        b = c = a;
        System.out.print(a + " " + b + " " + c);
    }
}