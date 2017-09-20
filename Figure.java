
public abstract class Figure implements Comparable <Figure>{



    public abstract double area();


    public  int compareTo(Figure f){
        return (int)(this.area()-f.area());
    }
}


