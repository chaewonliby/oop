public class TestParentChild {
    void showNameAnsValue(Parent base){
        System.out.println(base.getName());
//      System.out.println(base.getValue()); 에러나는 부분 업캐스팅
    }
    public static void main(String[] args) {
        TestParentChild test = new TestParentChild();
        Child derived = new Child("child",0);
        test.showNameAnsValue(derived);
    }


//    void showNameAnsValue(Child derived2){
//        System.out.println(derived2.getName());
////      System.out.println(derived2.getValue());
//    }
//    public static void main(String[] args) {
//        TestParentChild test = new TestParentChild();
//        Parent base2 = new Parent("parent");
//        test.showNameAnsValue(base2);
//    }
    // 다운캐스팅 경우, parent 비어있는 영역을 채울수없어서 오류가 남.
    //다운캐스팅은 업캐스팅한 객체를 명시적 형 변환을 통해
    //본래 클래스형의 변수/매개변수에 저장/전달할 때에만 가능

}
