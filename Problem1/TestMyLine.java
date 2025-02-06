// TestMyLine class to test the MyLine and MyPoint classes.
public class TestMyLine {
    public static void main(String[] args) {
        // Creating two points.
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);

        // Creating a line using the two points.
        MyLine line = new MyLine(p1, p2);

        // Printing the line details.
        System.out.println(line);
        
        // Printing the length of the line.
        System.out.println("Line length: " + line.getLength());
    }
}
