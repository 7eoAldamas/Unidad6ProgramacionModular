import java.util.Scanner;

public class Ejercicio3 {
//---

    int[] numeros = new int[8]; //Arreglo de 8 elementos
    boolean encontrado = false;
    Scanner sc = new Scanner(System.in);

    //--- Constructor Ejercicio3
    public Ejercicio3(String nombre) {
        System.out.println(nombre);
        initEjercicio();
    }

    private void initEjercicio() {
        ingresarDatos();
        mostrarDatos(numeros);
        busquedaDato(numeros);
    }

    public int[] ingresarDatos() { //Ingresamos los datos del arreglo
        System.out.println("====    Ingresar 8 numeros enteros   ====");
        for (int i = 0; i < 8; i++) {
            System.out.print("Dato [" + (i) + "] :");
            numeros[i] = sc.nextInt();
        }
        return numeros;
    }

    public void mostrarDatos(int[] numeros) { //Recorremos y mostramos los valores del arreglo
        System.out.println("====    Valores   ====\n");
        for (int i = 0; i < 8; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

    public void busquedaDato(int[] numeros) {
        int numBusqueda;
        int posicion = 0;
        System.out.print("\n\nIngrese el valor a buscar : ");
        numBusqueda = sc.nextInt(); //Ingresar el valor que se desea buscar

        for (int i = 0; i < 8; i++) {
            if (numBusqueda == numeros[i]) {
                encontrado = true;
                posicion = i; //Guardar la posición
            }
        }

        if (encontrado) {
            System.out.println("\nValor encontrado");
            System.out.println("Posicion --> " + (posicion));
        } else {
            System.out.println("Valor no hallado en el arreglo");
        }

    }

    public static void main(String[] args) {
        //--- Código Ejecutable
        new Ejercicio3("Ejercicio 3");
    }
}
