public class Child extends Parent{
    private int value;
    public Child(String n, int v) {
        super(n);
        //super(n); 이러면 에러 발생
        System.out.println("Child 코드");
        value = v;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int v) {
        value = v;
    }
}