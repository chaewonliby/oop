
public class ContinueInWhile {
    public static void main(String[] args) {
        int i =3;
        while(i<7){
            System.out.printf("if 전: i = %d\n", i);
            i += 2;
            System.out.printf("continue 전: i = %d\n", i);
            continue;

        }
        System.out.println("이건 출력되면 안됨!");
    }
}