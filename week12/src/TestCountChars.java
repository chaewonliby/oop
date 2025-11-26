import java.util.HashMap;
import java.util.Map;

public class TestCountChars {

    String str;

    public TestCountChars(String str) {
        this.str = str;
    }

    Map<Character, Integer> count() {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();

        for( char c : chars ) {
            if( map.containsKey(c) ) {
                map.put(c, map.get(c) + 1);
            }else {
                map.put(c, 1);
            }
        }
        return map;
    }


    public static void main(String[] args) {
        TestCountChars t = new TestCountChars("abc");
        Map<Character, Integer> map = t.count();
        System.out.println(map);
    }
}
