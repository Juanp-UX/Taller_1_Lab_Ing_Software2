package figures;


public class Circle extends Figure {
    private double radius;
    public Circle(double x1) {
        this.radius=x1;
        super(0, 0);
    }
    
    @Override
    public double calculateArea(){
        double area= radius*radius*3.1416;
        return area;
    }
    @Override
    public double calculatePerimeter() {
        double per= radius*2*3.1416;
        return per;
    }
}
