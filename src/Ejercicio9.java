import java.util.Scanner;

public class Ejercicio9 {
//---

    int[][] matriz1, matriz2, matrizSuma;
    int filas, columnas, fila2, columna2;
    Scanner sc = new Scanner(System.in);

    //--- Constructor Ejercicio9
    public Ejercicio9 (String nombre){
        System.out.println(nombre);
        initEjercicio();
    }

    private void initEjercicio() {
        pedirDimension();
    }

    public void pedirDimension(){ //Asignamos las dimensiones de los arreglos
        System.out.println("====    Matriz No 1    ====\n");
        System.out.println("====    Ingrese el numero de filas    ====");
        filas = sc.nextInt();
        System.out.println("====    Ingrese el numero de columnas    ====");
        columnas = sc.nextInt();

        System.out.println("\n\n====    Matriz No 2    ====\n");
        System.out.println("====    Ingrese el numero de filas    ====");
        fila2 = sc.nextInt();
        System.out.println("====    Ingrese el numero de columnas    ====");
        columna2 = sc.nextInt();

        if (sonIguales()){
            matriz1 = new int[filas][columnas]; //Creamos Matriz1 e ingresamos sus dimensiones
            matriz2 = new int[fila2][columna2]; //Creamos Matriz2 e ingresamos sus dimensiones

            matrizSuma = new int[filas][columnas]; //Matriz que almacenará la suma de Matriz1 y Matriz2

            ingresarDatos(matriz1, matriz2); //Ejecutamos - Ingresar Datos para poder pedir los números al usuario
            mostrarMatrices(matriz1, matriz2); //Ejecutamos - Mostrar Matrices para poder visualizar los números ingresados
            sumaMatrices(matrizSuma); //Ejecutamos - Sumar Matrices

        } else {
            System.out.println("\nLas matricces deben de tener las mismas dimensiones");
        }

    }

    public boolean sonIguales(){ //Verifica si las filas y columnas tienen los mismo valores
        if ((filas == fila2) && (columnas == columna2)){
            return  true;
        } else {
            return false;
        }
    }

    public void ingresarDatos(int[][] matriz1 , int[][] matriz2){ //Ingresamos los datos al arreglo
        System.out.println("\n====    Matriz No 1  ====\n");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print("Dato ["+i+"] ["+j+"] : ");
                matriz1[i][j] = sc.nextInt();
            }
            System.out.println("");
        }

        System.out.println("\n====    Matriz No 2  ====\n");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print("Dato ["+i+"] ["+j+"] : ");
                matriz2[i][j] = sc.nextInt();
            }
            System.out.println("");
        }

    }

    public void mostrarMatrices(int[][] matriz1, int[][] matriz2){ //Recorremos y mostramos el arreglo
        System.out.println("\n====    Valores Almacenados Matriz No 1    ====");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print("["+matriz1[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println("\n====    Valores Almacenados Matriz No 2    ====");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print("["+matriz2[i][j] + "]");
            }
            System.out.println("");
        }

    }

    public void sumaMatrices(int[][] matrizSuma){ //Calculamos la suma de Matriz1 y Matriz2
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("\n====    Valores de la Suma de la Matriz     ====");
        for (int i = 0; i < matrizSuma.length; i++) {   //Recorremos y mostramos el arreglo
            for (int j = 0; j < matrizSuma[i].length; j++) {
                System.out.print("["+matrizSuma[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //--- Código Ejecutable
        new Ejercicio9("Ejercicio 9");
    }
}
