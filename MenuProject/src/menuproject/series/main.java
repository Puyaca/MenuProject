package menuproject.series;

import menuproject.input.IntInput;

public class main {
    public static void main() {
	System.out.println("¿Que tipo de serie desea generar?\n1. Fibonacci\n2. Numero pares\n3. Numero impares\n4. Numeros primos\n5. Multiplos de 5\n6. Volver atras");
	int x = IntInput.LeerM(1, 6), c = 5000;
	switch(x){
	    case 1 -> Fibonacci.main();
	    case 2 -> Pares.main();
	    case 3 -> Impares.main();
	    case 4 -> Primos.main();
	    case 5 -> Multiplos.main();
	    case 6 -> c = 0;
	}
	try {
	    Thread.sleep(c);
	} catch (InterruptedException e) {}
    }
}