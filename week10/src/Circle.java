public class Circle extends Point{
    private double radius;

    public Circle(){} // 이거 안함 내가

    public Circle(int xnew, int ynew, int rnew){
        super(xnew, ynew);
        this.radius = rnew; //this 필수인가? 놓침
    }

    public double getRadius() {
        return radius;
    }// 이거도 안함

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

}
