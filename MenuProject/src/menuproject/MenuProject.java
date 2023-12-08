package menuproject;

import menuproject.input.IntInput;

public class MenuProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	System.out.println("Hola, bienvenido");
	boolean c = true;
	do {
	    System.out.println("\n¿Que desea hacer?\n1. Hallar un area/volumen\n2. Generar una serie\n3. Operar vectores\n4. Operar matrices\n5. Salir del programa");
	    int x = IntInput.LeerM(1, 5);
	    switch(x){
		case 1 -> menuproject.areas.main.main();
		case 2 -> menuproject.series.main.main();
		case 3 -> menuproject.vectores.main.main();
		case 4 -> menuproject.matrices.main.main();
		case 5 -> {
		    System.out.println("Adios");
		    c = false;
		}
	    }
	} while (c);
    }
}
