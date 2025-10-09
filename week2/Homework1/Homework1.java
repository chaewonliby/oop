import java.util.Scanner;

class  Homework1  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] student = new int[5];

        for (int num = 0; num < 5; num++) {
            System.out.print("정수를 입력하세요 (" + (num + 1) + "번째): ");
            student[num] = sc.nextInt();
            sum += student[num];
        }
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다. " , sum);
    }
}