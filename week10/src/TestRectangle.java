public class TestRectangle{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5,10);
        System.out.println("Rectangle area: "+r.getArea());

        Square s = new Square(10);
        System.out.println("Rectangle area: " + s.getArea());

        Rectangle r2 = s;
        r2.setWidth(5);
        r2.setHeight(10);// 위는 리스코프 치환 법칙 어긋남
    }
}
