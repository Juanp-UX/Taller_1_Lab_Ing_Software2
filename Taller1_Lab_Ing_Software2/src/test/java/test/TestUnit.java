
package test;

import figures.Circle;
import figures.Square;
import figures.Triangle;
import figures.Triangle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author juanp
 */
public class TestUnit {
    
    public TestUnit() {
    }
    //  Tests circle
    @Test
    public void testCircleArea() {
        // Radio (x1) = 5 
        //Area = 5 * 5 * 3.1416 = 78.54
        Circle circle = new Circle(5.0);
        double expectedArea = 78.54;
        assertEquals(expectedArea, circle.calculateArea());
    }

    @Test
    public void testCirclePerimeter() {
        // Radio (x1) = 5 
        //Perímetro = 5 * 2 * 3.1416 = 31.416
        Circle circle = new Circle(5.0);
        double expectedPerimeter = 31.416;
        assertEquals(expectedPerimeter, circle.calculatePerimeter());
    }
    //  Tests square
    @Test
    public void testSquareArea() {
        // Lado (x1) = 4 
        //Área = 4 * 4 = 16.0
        Square square = new Square(4.0);
        double expectedArea = 16.0;
        assertEquals(expectedArea, square.calculateArea());
    }

    @Test
    public void testSquarePerimeter() {
        // Lado (x1) = 4
        //Perímetro = 4 * 4 = 16.0
        Square square = new Square(4.0);
        double expectedPerimeter = 16.0;
        assertEquals(expectedPerimeter, square.calculatePerimeter());
    }
    //  Tests triangle 

    @Test
    public void testTriangleArea() {
        // Base(y1)=4, Altura(x1)=3 
        //Area = (3 * 4) / 2 = 6.0
        Triangle triangle = new Triangle(3.0, 4.0);
        assertEquals(6.0, triangle.calculateArea());
    }

    @Test
    public void testTrianglePerimeter() {
        /*
         * Hipotenusa = sqrt(3^2 + 4^2) = 5
         * Perímetro = 3 + 4 + 5 = 12.0
         */
        Triangle triangle = new Triangle(3.0, 4.0);
        double expectedPerimeter = 12.0;
        assertEquals(expectedPerimeter, triangle.calculatePerimeter());
    }
}

