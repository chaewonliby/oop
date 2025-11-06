public class Arabica extends CoffeeBean{
    private String species = "Arabica";

    @Override
    void print(){ //오버라이딩된 함수
        super.print();
        System.out.println("Method Overriding: " + species);
    }

    void print(String s){ //오버로딩된 함수
        System.out.printf("%s :%s " ,  species , s);
    }

}
