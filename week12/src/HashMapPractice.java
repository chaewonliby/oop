import java.util.Map;
import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        Map<String, Integer> channels = new HashMap<String, Integer>();
        //해시맵은 키-값을 빠르게 찾는 자료구조, 정렬순서 보장하지않음
        channels.put("SBS", 6);
        channels.put("KBS1", 9);
        channels.put("KBS2", 7);
        channels.put("EBS1", 10);
        channels.put("MBC", 11);
        System.out.println(channels);
        //for 배열문
        //entrySet() 은 HashMap 이 구현하는 Map 인터페이스에 정의된 메서드
        //Entry 는 Map 안에 선언된 중첩 인터페이스
        for (Map.Entry<String, Integer> entry : channels.entrySet()) {
            System.out.printf("television networks: %s, channel number: %d\n", entry.getKey() , entry.getValue());
        }
    }
}
