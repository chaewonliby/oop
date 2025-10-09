class FindStringWithFor{

public static void main(String[] args) {
    String[] cities = {"New York", "Beijing", "Seoul"};
    boolean a = false;
    for (int i = 0; i < cities.length; i++) {
        if (cities[i].equals("Seoul")) {
            System.out.println(i + " : " + cities[i]);
            a = true;
            break;
        }
        if (a = false) {
            System.out.println("해당 문자열을 찾을 수 없습니다.");

        }
    }

}
}

