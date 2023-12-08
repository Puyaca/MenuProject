package menuproject.areas;

import menuproject.input.DoubleInput;

public class Piramide {
    public static void volumen(){
	double b, h, a;
        System.out.println("Ingrese el lado de la base de su piramide en centimetros: ");
        b = DoubleInput.LeerM(0, 1000000000);
        a = b * b;
        System.out.println("Ingrese la altura de su piramide en centimetros: ");
        h = DoubleInput.LeerM(0, 1000000000);
        double v = 0.3333333333 * a * h;
        System.out.println("El area de su triangulo es de " + v + " centimetros cubicos.");
    }
}