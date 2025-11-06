public class TestCirCleHasAPoint {
    public static void main(String[] args) {
        CirCleHasAPoint myCirCle = new CirCleHasAPoint(10,10,5 );
        double myArea = myCirCle.getArea();
        System.out.println(myArea);
        System.out.printf("원 면적: %.2f\n",myArea);
        double myCircumference = myCirCle.getCircumference();
        System.out.println(myCircumference);// 소수점 자리 신경안쓰고 출력한 버전
        System.out.printf("원 둘레: %.2f\n",myArea); // 소수점 둘째 자리까지만 출력하게 하는 버전
    }
}
