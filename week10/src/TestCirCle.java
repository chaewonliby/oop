public class TestCirCle {
    public static void main(String[] args) {
        Circle myCircle = new Circle(10,10,5 );
        double myArea = myCircle.getArea();
        System.out.println("원 면적: " + myArea);
        System.out.printf("원 면적: %.2f \n" , myArea);
        double myCircumference = myCircle.getCircumference();
        System.out.println("원 둘레: " + myCircumference);
        System.out.printf("원 둘레: %.2f \n" , myCircumference);
    }
}
