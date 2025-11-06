public class Robusta extends CoffeeBean{
    private String species = "Robusta";

    @Override
    void print(){
        System.out.println("Method Overriding: " + species);
    }

}
