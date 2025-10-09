import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int n = sc.nextInt();

        int[] num = new int[n];

        System.out.print("수를 입력하세요: ");
        int min = 0, max = 0;

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            if (i == 0) {
                min = num[i];
                max = num[i];
            } else {
                if (num[i] < min) min = num[i];
                if (num[i] > max) max = num[i];
            }
        }

        System.out.printf("최대값: %d%n", max);
        System.out.printf("최소값: %d%n", min);

        sc.close();
    }
}
