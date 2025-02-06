// MyLine class represents a line using two points.
public class MyLine {
    private MyPoint begin; // Start point of the line.
    private MyPoint end;   // End point of the line.

    // Constructor to initialize the line with given begin and end points.
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Getter method for the begin point.
    public MyPoint getBegin() {
        return begin;
    }

    // Getter method for the end point.
    public MyPoint getEnd() {
        return end;
    }

    // Setter method for the begin point.
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    // Setter method for the end point.
    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // Method to calculate the length of the line using distance formula.
    public double getLength() {
        int dx = end.getX() - begin.getX();
        int dy = end.getY() - begin.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // toString method to return the line as a formatted string.
    @Override
    public String toString() {
        return "Line from " + begin + " to " + end;
    }
}
