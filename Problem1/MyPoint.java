// MyPoint class represents a point in a 2D space.
public class MyPoint {
    private int x; // X coordinate.
    private int y; // Y coordinate.

    // Constructor to initialize the point with given x and y values.
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter method for x coordinate.
    public int getX() {
        return x;
    }

    // Getter method for y coordinate.
    public int getY() {
        return y;
    }

    // Setter method for x coordinate.
    public void setX(int x) {
        this.x = x;
    }

    // Setter method for y coordinate.
    public void setY(int y) {
        this.y = y;
    }

    // toString method to return the point as a formatted string.
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
