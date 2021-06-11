import java.util.Scanner;

public class Ejercicio1 {
//---

    int[] numeros = new int[5]; //Arreglo de 5 elementos
    Scanner sc = new Scanner(System.in);

    //--- Constructor Ejercicio1
    public Ejercicio1(String nombre) {
        System.out.println(nombre);
        initEjercicio();
    }

    private void initEjercicio() {
        ingresarDatos();
        mostrarDatos(numeros);
    }

    public void ingresarDatos() { //Ingresamos los datos al arreglo
        System.out.println("====    Ingrese 5 valores   ====");
        for (int i = 0; i < 5; i++) {
            System.out.print("Dato [" + (i + 1) + "] :");
            numeros[i] = sc.nextInt();
        }

    }

    public void mostrarDatos(int[] numeros) { //Recorremos y mostramos los datos del arreglo
        System.out.println("====    Valores   ====\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("Dato [" + (i + 1) + "] : " + numeros[i]);
        }
    }

    public static void main(String[] args) {
        //--- Código Ejecutable
        new Ejercicio1("Ejercicio1"); //Instancia de la clase
    }
}
