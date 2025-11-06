public class CirCleHasAPoint {
    private Point center;
    private double radius;

    public CirCleHasAPoint() {}
    public CirCleHasAPoint(Point p, double r) {
        this.center = p;
        this.radius = r;
    }

    public CirCleHasAPoint(int x, int y, double r) {
        center = new Point(x, y);
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
}
