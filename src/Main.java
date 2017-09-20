
public class Main {

    public Figure [] f;
    public double res=0;



    public  void main(String[] args){
        Cercle c1= new Cercle(3);
        Cercle c2= new Cercle(4);
        Cercle c3= new Cercle(2);

        Triangle t1 = new Triangle(3,6);
        Triangle t2 = new Triangle(2,8);
        Triangle t3 = new Triangle(5,3);

        c1.area();
        c2.area();
        c3.area();

        t1.area();
        t2.area();
        t3.area();

        for (Figure f:f
                ) {

            res = res+ f.area();

        }
        System.out.println(res);

        

    }

}
