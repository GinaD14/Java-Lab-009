import java.awt.Point;
import java.awt.Rectangle;

public class Aliasing {
    public static void printPoint(Point p) {
        System.out.println("(" + p.x + ", " + p.y + ")");
    }

    public static Point findCenter(Rectangle box) {
        int x = box.x + box.width / 2;
        int y = box.y + box.height / 2;
        return new Point(x, y);
    }

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(2, 4, 7, 9);
        Point p1 = findCenter(box1); // Creates a new Point object based on box1's coordinates
        printPoint(p1); // Prints the center of box1

        box1.grow(1, 1); // Increases the size of box1 by 1 unit in all directions

        Point p2 = findCenter(box1); // Creates a new Point object based on the modified box1's coordinates
        printPoint(p2); // Prints the center of the modified box1
    }
}
