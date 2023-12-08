package menuproject.series;

import menuproject.input.IntInput;

public class Multiplos {
    public static void main(){
	System.out.println("Ingrese cuantos numero desea imprimir");
	int n = IntInput.LeerM(1, 150), c = 5;
        for (int i = 1; i <= n; ++i) {
	    System.out.print(c + ", ");
	    c += 5;
	}
    }
}