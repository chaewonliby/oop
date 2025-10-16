import java.util.Scanner;

class Homework4 {

    static int abs(int x) {
        return (x >= 0) ? x : -x;
    }

    // 뺄셈 기반 유클리드 호제법 (재귀)
    static int gcd(int a, int b) {
        a = abs(a);
        b = abs(b);

        // 둘 중 하나가 0이면 다른 쪽이 GCD
        if (a == 0) return b;
        if (b == 0) return a;

        if (a == b) return a;
        if (a > b) return gcd(a - b, b);
        return gcd(a, b - a);
    }

    static int gcdIterative(int a, int b) {
        a = abs(a);
        b = abs(b);
        // 유클리드 호제법: (a, b) -> (b, a % b)
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int result = gcd(m, n); // 재귀(뺄셈) 버전
        System.out.println("두 수의 최대공약수는 " + result + "입니다.");

    }
}
