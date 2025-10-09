import java.util.Scanner;

public class MovieTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String zone = scanner.next();

        if (zone.compareTo("prime") == 0) {
            System.out.println("프라임존 표는 11000원.");
        }
        else if (zone.compareTo("standard") == 0) {
            System.out.println("스탠다드존 표는 10000원.");
        }
        else if (zone.compareTo("economy") == 0) {
            System.out.println("이코노미존 표는 9000원.");
        }
        else {
            System.out.println("좌석 종류를 잘못 입력했습니다.");
        }
    }
}