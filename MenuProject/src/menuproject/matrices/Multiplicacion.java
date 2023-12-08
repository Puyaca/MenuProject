package menuproject.matrices;

import menuproject.input.IntInput;

public class Multiplicacion{
    public static void main() {
	System.out.println("Determine el tamaño de las filas de las matrices A , B y C:");
        int N = IntInput.LeerM(1, 10);
        System.out.println("Determine el tamaño de las columnas de las matrices A , B y C:");
        int M = IntInput.LeerM(1, 10);
        int matrizA[][] = new int [N][M];
        int matrizB[][] = new int [N][M];
        int matrizC[][] = new int [N][M];
        System.out.println(" ");
        for(int f = 0 ; f < N ; f++){
            for(int c = 0 ; c < M ; c++){
                System.out.print("Ingrese un valor para la MatrizA[" + f + "][" + c + "] -> ");
                matrizA[f][c] = IntInput.Leer();
            }
        }
        System.out.println("");
        for(int f = 0 ; f < N ; f++){
            for(int c = 0 ; c < M ; c++){
                System.out.print("Ingrese un valor para la MatrizB[" + f + "][" + c + "] -> ");
                matrizB[f][c] = IntInput.Leer();
            }
        }
        System.out.println("\nMostrando Matriz A:");
        for(int f = 0 ; f < N ; f++){
            for(int c = 0 ; c < M ; c++){
                System.out.println( matrizA[f][c] + " " );
            }
            System.out.println(" ");
        }
        System.out.println("\nMostrando Matriz B:");
        for(int f = 0 ; f < N ; f++){
            for(int c = 0 ; c < M ; c++){
                System.out.println( matrizB[f][c] + " " );
            }
            System.out.println(" ");
        }
        System.out.println("La Multilpicacion de las matrices A y B es:");
        for(int f = 0 ; f < N ; f++){
            for(int c = 0 ; c < M ; c++){
		matrizC[f][c] = (matrizA[f][c] * matrizB[f][c]);
                System.out.print(matrizC[f][c] + " " );
            }
            System.out.println(" ");
        }
    }
}