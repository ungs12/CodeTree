public class Main {
    public static void main(String[] args) {
        int a = 2, b = 5, temp;
        temp = b;
        b = a;
        a = temp;
        System.out.println(a);
        System.out.print(b);
    }
}