
public class Triangle extends Figure{

    public double base;
    public double lado;

    public Triangle(double b, double l){
        this.base = b;
        this.lado = l;
    }

    public double area() {

        return (base*lado)/2;
    }

}
