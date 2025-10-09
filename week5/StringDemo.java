
public class StringDemo {
    public static void main(String[] args) {
        String str = "가 나, 다, i.n";
        String delimiters = "\\s+|,\\s*|\\.\\s*";

        // analyzing the string
        String[] tokensVal = str.split(delimiters);

        // prints the count of tokens
        System.out.println("Count of tokens = " + tokensVal.length);
        for(String token : tokensVal) {
            System.out.print(token);
        }

    }
}