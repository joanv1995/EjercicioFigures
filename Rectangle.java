
public class Rectangle extends Figure{

    public double base;
    public double lado;

    public Rectangle(double b, double l){
        this.base = b;
        this.lado = l;
    }

    public double area() {
        return (base*lado);
    }

}
