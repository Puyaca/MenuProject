package menuproject.areas;

import menuproject.input.DoubleInput;

public class Paralelogramo {
    public static void area(){
	double b, h;
        System.out.println("Ingrese la base de su paralelogramo en centimetros: ");
        b = DoubleInput.LeerM(0, 1000000000);
        System.out.println("Ingrese la altura de su piramide en centimetros: ");
        h = DoubleInput.LeerM(0, 1000000000);
        double a = b * h;
        System.out.println("El area de su paralelogramo es de " + a + " centimetros cuadrados.");
    }
}