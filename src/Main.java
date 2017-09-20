
public class Main {

    public static void main(String[] args) {
        Figure[] listaFiguras = new Figure[6];
        double res = 0;

        Cercle c1 = new Cercle(3);
        Cercle c2 = new Cercle(4);
        Cercle c3 = new Cercle(2);

        Triangle t1 = new Triangle(3, 6);
        Triangle t2 = new Triangle(2, 8);
        Triangle t3 = new Triangle(5, 3);

        c1.area();
        c2.area();
        c3.area();

        t1.area();
        t2.area();
        t3.area();

        listaFiguras[0] = c1;
        listaFiguras[1] = c2;
        listaFiguras[2] = c3;
        listaFiguras[3] = t1;
        listaFiguras[4] = t2;
        listaFiguras[5] = t3;

        for (Figure f : listaFiguras) {
            res = res + f.area();

        }
        System.out.println(res);
    }

}
