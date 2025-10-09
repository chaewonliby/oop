class Hello {
    String toWhom = "world";
    Hello() {
        System.out.println("기본 생성자가 호출됨.");
    }
    Hello(String whom) {
        System.out.println("문자열 인자를 받는 생성자가 호출됨");
        toWhom = whom;
    }
    void setWhom(String whom) {
        toWhom = whom;
    }
    void sayHello() {
        System.out.println("hello " + toWhom);
    }
}
class TestHello3