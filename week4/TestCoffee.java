class Coffee {
    String origin;
    String grade;
    int degreeOfRoast;

    Coffee(String o) {
        origin = o;
    }

    Coffee(String o, String g) {
        origin = o; ,grade = g;
    }
    public void roast(int d) {
        System.out.println("roasting…" + origin + grade)
        degreeOfRoast = d;
    }
    public void grind(){
        System.out.println("roasting…" + origin + )
    }
    public void brew(){
        System.out.println();
    }

}

class TestCoffee {
    public static void main(String[] args) {
        Coffee brazilCoffee = new Coffee("Kenya", "AA");
        brazilCoffee.roast(1);
        brazilCoffee.grind();
        brazilCoffee.brew();
    }
}
