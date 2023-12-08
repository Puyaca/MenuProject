package menuproject.series;

import menuproject.input.IntInput;

public class Primos {
    public static void main(){
	System.out.println("Ingrese hasta que numero desea imprimir");
	int n = IntInput.LeerM(1, 1000),al;
        for(int i = 2; i <= n; ++i){
            al = 2;
            while(i % al != 0){
                ++al;
            }
            if(al == i){
                System.out.print(i + ", ");
            }
        }
    }
}
