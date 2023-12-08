package menuproject.vectores;

import menuproject.input.IntInput;

public class Resta {
    public static void main() {
	System.out.println("Defina el n tamaño de los vectores A , B y C:");
        int N = IntInput.LeerM(1, 25);
        int vectorA[] = new int [N];
        int vectorB[] = new int [N];
        int vectorC[] = new int [N];
        System.out.println("\nIngrese los valores para el vector A:");
        for (int i = 0 ; i < N ; ++i){
            System.out.print("VectorA[" + i + "] -> ");
            vectorA[i] = IntInput.Leer();
        }
        System.out.println("\nIngrese los valores para el vector B:");
        for (int i = 0 ; i < N ; ++i){
            System.out.print("VectorB[" + i + "] -> ");
            vectorB[i] = IntInput.Leer();
        }
        System.out.println("\nMostrando vector A:");
        for (int i = 0 ; i < N ; ++i){
            System.out.print( vectorA[i] + " " );
        }
        System.out.println("\nMostrando vector B:");
        for (int i = 0 ; i < N ; ++i){
            System.out.print( vectorB[i] + " " );
        }
        System.out.println("\nLa Resta del vector A y el vector B, nos da el vector C:");
        for(int i = 0 ; i < N ; ++i){
	    vectorC[i] = vectorA[i] - vectorB[i];
            System.out.print( vectorC[i] + " " );
        }
    }
}
