public class Main {
    public static void main(String[] args) {
        Parent p = new Parent("부모");
        Child c = new Child("자식",0);
        System.out.println(c.getName());
        System.out.println(c.getValue());
        System.out.printf("c instanceof Child: %s\n", c instanceof Child );
        System.out.printf("p instanceof Parent: %s\n", p instanceof Parent );
        System.out.printf("c instanceof Parent: %s\n", c instanceof Parent );
    }
}
