class Hello {
    String toWhom = "world";
    Hello() {
    }
    void setWhom(String whom) {
        toWhom = whom;
    }
    void sayHello() {
        System.out.println("hello " + toWhom);
    }
}

public class TestHello {
    public static void main(String[] args) {

        Hello arr[] = new Hello[3];
        for (int i =0; i <3; i++){
            arr[i] = new Hello();
        }
        String whom[] =  { "ycho", "jsl", "everyone" };
        int index = 0;
        for ( Hello h : arr){
            h.setWhom(whom[index]);
            index++;
        }
        for ( Hello h : arr){
            h.sayHello();
        }



    }
}
