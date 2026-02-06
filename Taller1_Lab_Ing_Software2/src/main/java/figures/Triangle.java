
package figures;


public class Triangle extends Figure {
    
    public Triangle(double x1, double y1) {
        super(x1, y1);
    }
    @Override
    public double calculateArea(){
        double area= getX1()*getY1()/2;
        return area;
    }
    @Override
    public double calculatePerimeter() {
        double base = getY1();
        double altura = getX1();
        double hip = Math.sqrt(base * base + altura * altura);
        return base + altura + hip;
    }
}
