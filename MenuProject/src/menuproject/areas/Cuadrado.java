package menuproject.areas;

import menuproject.input.DoubleInput;

public class Cuadrado {
    public static void area(){
	System.out.println("Ingrese el lado de su cuadrado en centimetros: ");
        double b = DoubleInput.LeerM(0, 1000000000);
        double a = b * b;
        System.out.println("El area de su cuadrado es de " + a + " centimetros cuadrados.");
    }
}