package menuproject.vectores;

import menuproject.input.IntInput;

public class main {
    public static void main() {
	System.out.println("Operacion a realizar\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Volver atras");
	int x = IntInput.LeerM(1, 4), c = 5000;
	switch(x){
	    case 1 -> Suma.main();
	    case 2 -> Resta.main();
	    case 3 -> Multiplicacion.main();
	    case 4 -> c = 0;
	}
	try {
	    Thread.sleep(c);
	} catch (InterruptedException e) {}
    }
}
