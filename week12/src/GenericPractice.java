import java.util.ArrayList;

public class GenericPractice {
    public static void main(String[] args) {
        // 제네릭은 <> 다이아몬드표기로 표현
        ArrayList<String> list = new ArrayList<String>();
        list.add("Seoul");
        list.add("Busan");
        System.out.println(list);

        //제네릭도 객체만 사용가능
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(1);
//        numList.add(new Integer(7));//자바9부터 자제 권고
        numList.add(Integer.valueOf(7));
        System.out.println(numList.get(0));
        System.out.println(numList.get(1));
        System.out.println(numList);

    }
}
