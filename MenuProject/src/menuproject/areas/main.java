package menuproject.areas;

import menuproject.input.IntInput;

public class main {
    public static void main() {
	System.out.println("¿Que tipo de area/volumen desea hallar?\n1. Area de un circulo\n2. Area de un cuadrado\n3. Area de un triangulo rectangulo\n4. Area de un paralelogramo\n5. Volulmen de una esfera\n6. Volumen de un cubo\n7. Volumen de una priramide\n8. Volumen de un cono\n9. Volver atras");
	int x = IntInput.LeerM(1, 9), c = 5000;
	switch(x){
	    case 1 -> Circulo.area();
	    case 2 -> Cuadrado.area();
	    case 3 -> Triangulo.area();
	    case 4 -> Paralelogramo.area();
	    case 5 -> Esfera.volumen();
	    case 6 -> Cubo.volumen();
	    case 7 -> Piramide.volumen();
	    case 8 -> Cono.volumen();
	    case 9 -> c = 0;
	}
	try {
	    Thread.sleep(c);
	} catch (InterruptedException e) {}
    }
}