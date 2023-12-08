package menuproject.areas;

import menuproject.input.DoubleInput;

public class Triangulo {
    public static void area(){
	double b, h;
        System.out.println("Ingrese la base de su triangulo en centimetros: ");
        b = DoubleInput.LeerM(0, 1000000000);
        System.out.println("Ingrese la altura de su triangulo en centimetros: ");
        h = DoubleInput.LeerM(0, 1000000000);
        double a = (b * h) / 2;
        System.out.println("El area de su triangulo es de " + a + " centimetros cuadrados.");
    }
}