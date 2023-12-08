package menuproject.input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntInput {
    
    public static int Leer() {
	int x;
	Scanner scan = new Scanner(System.in);
	x = 0;
	boolean c = true;
	do {
	    try {
		x = scan.nextInt();
		c = false;
	    } catch (InputMismatchException e) {
		System.out.println("Por favor ingrese un número entero");
		scan.nextLine();
	    }
	} while (c);
        return x;
    }
    
    public static int LeerM(int a, int b){
	int x;
	Scanner scan = new Scanner(System.in);
	x = 0;
	boolean c = true;
	do {
	    try {
		x = scan.nextInt();
		if (x >= a && x <= b) {
		    c = false;
		}else{
		    System.out.println("Por favor ingrese un numero entre " + a + " y " + b);
		}
	    } catch (InputMismatchException e) {
		System.out.println("Por favor ingrese un numero entero entre " + a + " y " + b);
		scan.nextLine();
	    }
	} while (c);
        return x;
    }
}