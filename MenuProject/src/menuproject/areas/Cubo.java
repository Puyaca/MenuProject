package menuproject.areas;

import menuproject.input.DoubleInput;

public class Cubo {
    public static void volumen(){
	System.out.println("Ingrese el lado de su cubo en centimetros: ");
        double b = DoubleInput.LeerM(0, 1000000000);
        double a = b * b * b;
        System.out.println("El volumen de su cubo es de " + a + " centimetros cubicos.");
    }
}