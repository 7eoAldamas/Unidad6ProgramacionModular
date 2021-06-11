import java.util.Scanner;

public class Ejercicio10 {
//---

    final int FILAS_MAX = 3;
    final int COLUM_MAX = 4;
    int[][] matriz = new int[FILAS_MAX][COLUM_MAX]; //Dimensión del arreglo 3 filas y 4 columnas
    Scanner sc = new Scanner(System.in);

    //--- Constructor Ejercicio10
    public Ejercicio10 (String nombre){
        System.out.println(nombre);
        initEjercicio();
    }

    private void initEjercicio() {
        ingresarDatos(matriz);
        mostrarMatrices(matriz);
    }

    public int[][] ingresarDatos(int[][] matriz){ //Ingresamos los valores de nuestra matriz
        System.out.println("\n====    Matriz   ====\n");
        for (int i = 0; i < FILAS_MAX; i++) {
            for (int j = 0; j < COLUM_MAX; j++) {
                System.out.print("Dato ["+i+"] ["+j+"] : ");
                matriz[i][j] = sc.nextInt();
            }
            System.out.println("");
        }
        return matriz;
    }

    public void mostrarMatrices(int[][] matriz){ //Mostramos e imprimimos tanto la matriz original como la matriz transpuesta
        System.out.println("\n====    Matriz Original   ====\n");
        for (int i = 0; i < FILAS_MAX; i++) {
            for (int j = 0; j < COLUM_MAX; j++) {
                System.out.print(" ["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }

        System.out.println("\n====    Matriz Transpuesta   ====\n");
        for (int i = 0; i < COLUM_MAX; i++) {     //Para la matriz transpuesta solo se intercambia el for en el orden
            for (int j = 0; j < FILAS_MAX; j++) { // en que se impriman los datos.
                System.out.print(" ["+matriz[j][i]+"] ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        //--- Código Ejecutable
        new Ejercicio10("Ejercicio 10");
    }
}
