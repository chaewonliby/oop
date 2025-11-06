public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int h) {
        height = h;
    }
    public void setWidth(int w) {
        width = w;
    }
    public int getArea() {
        return width * height;
    }
}
