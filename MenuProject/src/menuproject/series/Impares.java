package menuproject.series;

import menuproject.input.IntInput;

public class Impares {
    public static void main(){
	System.out.println("Ingrese cuantos numero desea imprimir");
	int n = IntInput.LeerM(1, 150), b = 1;
        for(int i = 1; i <= n; ++i){
            System.out.print(b + ", ");
            b += 2;
        }
    }
}
