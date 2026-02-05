
package figuras;

public class Square extends Figure {
    
    public Square(double x1) {
        super(x1, x1);
    }
    @Override
    public double calculateArea(){
        double area= getX1()*getY1();
        return area;
    }
    @Override
    public double calculatePerimeter() {
        double per= getX1()*4;
        return per;
    }
}
