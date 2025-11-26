import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPractice {
    public static void main(String[] args) {
        //반복자는 자바의 컬렉션 클래스에서 같은 방법을 통해 각 요소에 대한 작업가능하게하는
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Seoul");
        cities.add("Tokyo");
        cities.add("Washington, D.C.");
        cities.add("Beijing");

        Iterator it = cities.iterator();
        //while 문을 사용해 출력시
        // hasNext() 요소가 더 존재하는지 확인. true 또는 false 반환
        // next() 다음 요소 가져오기. Object 를 반환하므로 변환해서 사용
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }

        System.out.println("");

        //for 문 사용 시
        for( Iterator iter = cities.iterator(); iter.hasNext(); ) {
            String s = (String) iter.next();
            System.out.println(s);
        }

        System.out.println("");

        //반복자 대신 for each 구문 사용 가능
        // for each 는 요소 삭제 또는 요소를 변경하는 작업에서는 사용 불가
        for( String city : cities ){
            System.out.println(city);
        }

    }
}
