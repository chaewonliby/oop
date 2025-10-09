import java.util.Scanner;
class InputBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println( s);
        int n = sc.nextInt();
        System.out.println( n);
        String s1 = sc.nextLine();
        System.out.println(s1);
    }
}