package Problem2;

// TestMyRectangle class to test the MyRectangle and MyPoint classes.
public class TestMyRectangle {
    public static void main(String[] args) {
        // Creating two points.
        MyPoint topLeft = new MyPoint(2, 8);
        MyPoint bottomRight = new MyPoint(6, 3);

        // Creating a rectangle using the two points
        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);

        // Printing the rectangle details.
        System.out.println(rectangle);
        
        // Printing rectangle properties.
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
