package menuproject.input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleInput {
    
    public static double Leer() {
	double x;
	Scanner scan = new Scanner(System.in);
	x = 0;
	boolean c = true;
	do {
	    try {
		x = scan.nextDouble();
		c = false;
	    } catch (InputMismatchException e) {
		System.out.println("Por favor ingrese un número");
		scan.nextLine();
	    }
	} while (c);
        return x;
    }
    
    public static double LeerM(double a, double b){
	double x;
	Scanner scan = new Scanner(System.in);
	x = 0;
	boolean c = true;
	do {
	    try {
		x = scan.nextDouble();
		if (x >= a && x <= b) {
		c = false;
		}else{
		    System.out.println("Por favor ingrese un numero entre " + a + " y " + b);
		}
	    } catch (InputMismatchException e) {
		System.out.println("Por favor ingrese un numero entre " + a + " y " + b);
		scan.nextLine();
	    }
	} while (c);
        return x;
    }
}