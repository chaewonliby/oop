public class Point {
    private int x;
    private int y;

    public Point() {}

    public Point(int xnew, int ynew) {
        this.x = xnew;
        this.y = ynew;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
