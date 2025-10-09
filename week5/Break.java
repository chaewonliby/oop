import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);

        do {
            ch = sc.next().charAt(0);
            if (ch != 'n') {
                System.out.println(ch);
            }
            else {
                break;

            }

//            break; 여기다 하지말자...

        } while (true);
    }
}