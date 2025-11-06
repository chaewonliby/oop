public class TestGetClass {
    public static void main(String[] args) {
        CoffeeBean c = new CoffeeBean();
        System.out.println("c의 클래스는:" + c.getClass());

        Arabica a = new Arabica();
        System.out.println("a의 클래스는:" + a.getClass());

        Robusta r = new Robusta();
        System.out.println("r의 클래스는:" + r.getClass());

        Arabica a1 = new Arabica();
        a1.print();

        Robusta r1 = new Robusta();
        r1.print();

        CoffeeBean c1 = new Arabica();// 오버라이드 어노테이션 있어야 업캐스팅가능
        c1.print();

        Arabica a2 = new Arabica();
//        a2.print("오버로딩");
        a2.setSpecies("Coffee");
        a2.print("오버로딩");

    }
}
