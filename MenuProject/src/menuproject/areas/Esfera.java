package menuproject.areas;

import menuproject.input.DoubleInput;

public class Esfera {
    public static void volumen(){
	System.out.println("Ingrese el radio de su circunferencia en centimetros: ");
        double b = DoubleInput.LeerM(0, 1000000000);
        b = Math.pow(b, 3);
        double a = 1.333333333 * 3.1416 * b;
        System.out.println("El volumen de su esfera es de " + a + " centimetros cubicos.");

    }
}