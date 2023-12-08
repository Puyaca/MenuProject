package menuproject.series;

import menuproject.input.IntInput;

public class Pares {
    public static void main(){
	System.out.println("Ingrese cuantos numero desea imprimir");
	int n = IntInput.LeerM(1, 150), a = 2;
        for(int i = 1; i <= n; ++i){
            System.out.print(a + ", ");
            a += 2;
        }
    }
}
