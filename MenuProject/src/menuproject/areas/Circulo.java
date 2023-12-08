package menuproject.areas;

import menuproject.input.DoubleInput;

public class Circulo {
    public static void area() {
	System.out.println("Ingrese el radio de su circunferencia en centimetros: ");
        double b = DoubleInput.LeerM(0, 1000000000);
        b = Math.pow(b, 2);
        double a = 3.1416 * b;
        System.out.println("El area de su circunferencia es de " + a + " centimetros cuadrados.");
    }
}