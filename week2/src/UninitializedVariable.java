// UninitializedVariable.java
/*초기화시키지 않은 변수를 사용할 때 오류 발생 사례*/
public class UninitializedVariable {
    public static void main(String[] args) {
        int num;
        System.out.println("num = " + num);
    }
}