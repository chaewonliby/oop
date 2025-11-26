import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();

        arr.add("Seoul");
        arr.add(5);
        System.out.println(arr);

        arr.add(1, "Busan"); //dd() 함수의 첫번째 파라미터로 인덱스 전달 가능
        // 1번째 인덱스에 부산을 넣음
        System.out.println(arr);

//        arr.add(6,"Daegu");//범위벗어나면 오류 발생
//
//        System.out.println(arr);

        //자료 접근하려면 grt()함수 사용
        //자료 요소 확인은 size() 함수 사용
        System.out.println(arr.get(2));
        //[Seoul, 5]
        //[Seoul, Busan, 5] >>  그래서 결과 5임.
        System.out.println(arr.size());

        //각 요소의 화면 출력 배열 활용
        for (Object o : arr) {
            System.out.println(o);
        }
    }
}
