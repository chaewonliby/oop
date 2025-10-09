
public class Cup1Cup2While {
    public static void main(String[] args) {

        int Cup1 = 10;
        int Cup2 = 50;
        while (Cup1 < Cup2) {
            Cup1 = Cup1 + 1;
        }
//      같은 결과로 위는 while문 아래는 do while문
//        do{
//            Cup1 = Cup1 + 1;
//        }while(Cup1 < Cup2);

        System.out.println("Cup1 = " + Cup1);
        System.out.println("Cup2 = " + Cup2);
    }
}