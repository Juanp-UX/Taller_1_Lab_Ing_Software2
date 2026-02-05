package figuras;


public class Circle extends Figure {
    
    public Circle(double x1) {
        super(x1, x1);
    }
    
    @Override
    public double calculateArea(){
        double area= getX1()*getX1()*3.1416;
        return area;
    }
    @Override
    public double calculatePerimeter() {
        double per= getX1()*2*3.1416;
        return per;
    }
}
