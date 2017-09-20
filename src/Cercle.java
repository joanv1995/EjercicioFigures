
public class Cercle extends Figure {

    public double radi;

    public Cercle(double r){
        this.radi = r;
    }

    public double area() {

        return radi*(Math.pow((Math.PI),2));
    }
}

