import java.util.Scanner;

public class Inputint7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1; // do while문 아니면 초기값세팅해야함
        while( a> 0 ) {
            a = sc.nextInt();
            System.out.println( a + " ");
            if( a > 100 ) {break;}

        }
        System.out.println("이건 출력되면 안됨!");

    }
}