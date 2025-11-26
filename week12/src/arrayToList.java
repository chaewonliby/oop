import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayToList {
    public static void main(String[] args) {

        Integer[] a = {1,2,3};
        List<Integer> l = Arrays.asList(a); // 배열 → 리스트 변환
        System.out.println(l);

//        int[] b = {1,2,3};
//        List<Integer> l2 = Arrays.asList(b); // 배열 → 리스트 변환
//        System.out.println(l2); // 객체배열만 가능함 기본형배열은 오류발생

        //아래도 오류 일어날것
//        l.add(4); // Arrays.asList()에서 반환되는 리스트는 크기 변경 불가
//        System.out.println(l);

        //배열을 크기 변경 가능한 리스트로 변환
        //Arrays.asList()의 결과물(l)을 ArrayList 의 생성자로 전달
        ArrayList<Integer> arrayList = new ArrayList<Integer>(l);

        arrayList.add(4);
        System.out.println(arrayList);

        //리스트를 배열로 변환
        // ArrayList 인터페이스에 있는 toArray() 함수를 사용
        Integer[] arr = arrayList.toArray(new Integer[arrayList.size()]);

        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        Integer[] arr2 = arrayList.toArray(new Integer[0]);
        System.out.println(arr2);
        System.out.println(Arrays.toString(arr2));

        // <T> T[] toArray(T[] a) a는 어떤 타입의 배열/ 길이가 충분한지
        //arrayList.size() == 4 라고 가정하면 new Integer[4] (길이 == 사이즈)
        //new Integer[0] / new Integer[1] (길이 < 사이즈)  새 배열 생성해서 채움
        Integer[] arr3 = arrayList.toArray(new Integer[1]);
        System.out.println(arr3);
        System.out.println(Arrays.toString(arr3)); // 이쁘게 출력하기 위한

        //길이가 더 클 때 [1, 2, 3, 4, null] 이렇게 출력해서 값을 채움
        Integer[] arr4 = arrayList.toArray(new Integer[5]);
        System.out.println(arr4);
        System.out.println(Arrays.toString(arr4));

    }
}
