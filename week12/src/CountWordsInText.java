import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountWordsInText {

    private String[] doc;
    private Map<String,Integer> words;
    private ArrayList<String> wordList;

    public CountWordsInText(String[] doc){
        this.doc = doc;
        words = new HashMap<String,Integer>();
        wordList = new ArrayList<String>();
    }

    public void countWords(){
        for(String list : doc) {
            String[] word = list.split("(\\,|\\!|\\;|\\.|\\s+)+");
            for (String s : word) {
                if (words.containsKey(s)) { // 여기 실수함
                    words.put(s, words.get(s) + 1);
                } else {
                    wordList.add(s); // 이걸 안함
                    words.put(s, 1);
                }
            }
        }
    }

    public void printWordsShownMoreThan(int n){
        for(String list : wordList) {
            int count = words.get(list);
            if (count >= n) {
                System.out.printf("%s : %d\n", list, count);
                }
            }
    }

    public static void main(String[] args) {
        String doc[] = {
                "Hear the sledges with the bells",
                "Silver bells!",
                "What a world of merriment their melody foretells!",
                "How they tinkle, tinkle, tinkle,",
                "In the icy air of night!",
                "While the stars, that oversprinkle",
                "All the heavens, seem to twinkle",
                "With  a crystalline delight;",
                "Keeping time, time, time,",
                "In a sort if Runic rhyme,",
                "To the tintinabulation that so musically wells",
                "From the bells, bells, bells, bells,",
                "Bells, bells, bells,",
                "From the jingling and the tinkling of the bells."
        };

        CountWordsInText countWords = new CountWordsInText(doc);
        countWords.countWords();
        countWords.printWordsShownMoreThan(3);
    }
}
