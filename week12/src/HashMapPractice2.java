import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapPractice2 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
//        map.put("Windows", "2000"); 이거 아래가 한번더 쓰면 교체되는 것
        map.put("Windows", "XP");
        map.put("Language", "Java");
        map.put("Website", "smu.ac.kr");

        System.out.println(map);
        System.out.println(map.containsKey("Website")); //true false 응답
        System.out.println(map.containsKey("website")); //true false 응답 대소문자 구분
        System.out.println(map.get("Website")); //맵에서 키에 해당되는 값에 접근하는 것 get()

        //반복자 사용 시
        //Map 의 키를 세트(Set)으로 받을 수 있고, 세트에는 반복자가 있음
        Iterator<String> keys = map.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            System.out.printf("key = %s, value = %s\n", key, map.get(key));
        }

        // for each 문 사용시
        //Map.entrySet() 모든 요소 세트로 받음
        // Map 에 있는 각 요소에 접근방법:  Map.Entry<키_객체_자료형, 값_객체_자료형> 자료형 변수
        // getKey() getValue() 접근 시 사용
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.printf("key = %s, value = %s\n", entry.getKey(), entry.getValue());
        }

    }
}
