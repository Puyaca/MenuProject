package menuproject.areas;

import menuproject.input.DoubleInput;

public class Cono {
    public static void volumen(){
	double r, h;
        System.out.println("Ingrese el radio de la base de su cono en centimetros: ");
        r = DoubleInput.LeerM(0, 1000000000);
        System.out.println("Ingrese la altura de su cono en centimetros: ");
        h = DoubleInput.LeerM(0, 1000000000);
        r = Math.pow(r,2); 
        double v = 0.3333333333 * 3.1416 * r * h;
        System.out.println("El volumen de su cono es de " + v + " centimetros cubicos.");
    }
}