package menuproject.series;

import menuproject.input.IntInput;

public class Fibonacci {
    public static void main(){
	System.out.println("Ingrese cuantos numero desea imprimir");
	int n = IntInput.LeerM(1, 150), s = 1, n1 = 0, n2 = 1;
	for(int i = 1; i <= n; ++i){
	    System.out.print(s + ", ");
	    s = n1 + n2;
	    n1 = n2;
	    n2 = s;
	}
    }
}
