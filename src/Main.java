import java.util.Collections;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Figure[] listaFiguras = new Figure[12];
        double[] lista_area = new double[12];    // Array ordenado de las areas de las figuras.
        double res = 0;


        Cercle c1 = new Cercle(4);
        Cercle c2 = new Cercle(4);
        Cercle c3 = new Cercle(2);

        Triangle t1 = new Triangle(3, 6);
        Triangle t2 = new Triangle(2, 8);
        Triangle t3 = new Triangle(5, 3);

        Rectangle r1 = new Rectangle(5,8);
        Rectangle r2 = new Rectangle(2,7);
        Rectangle r3 = new Rectangle(6,3);

        Quadrat q1 = new Quadrat(5);
        Quadrat q2 = new Quadrat(9);
        Quadrat q3 = new Quadrat(6);

        c1.area(); c2.area(); c3.area();

        t1.area(); t2.area(); t3.area();

        r1.area(); r2.area(); r3.area();

        q1.area(); q2.area(); q3.area();


        listaFiguras[0] = c1;
        listaFiguras[1] = c2;
        listaFiguras[2] = c3;
        listaFiguras[3] = t1;
        listaFiguras[4] = t2;
        listaFiguras[5] = t3;
        listaFiguras[6] = r1;
        listaFiguras[7] = r2;
        listaFiguras[8] = r3;
        listaFiguras[9] = q1;
        listaFiguras[10] = q2;
        listaFiguras[11] = q3;

        int i=0;
        for (Figure f : listaFiguras) {
            lista_area[i] = (Math.round(f.area()*100.0))/100.0;     // Round areas a 2 decimales
            res = res + (Math.round(f.area()*100.0)/100.0);
            i++;
        }

        Arrays.sort(lista_area); // Orden creciente lista_area

        System.out.println("Areas ordenadas en orden creciente: (cm^2)");
        int j=0;
        for(double temp: lista_area){
            System.out.println(+j + " : " + temp);
            j++;
        }

        System.out.println("La suma de las areas es: " + res + " cm^2");
        System.out.println("Holi);
    }
}
