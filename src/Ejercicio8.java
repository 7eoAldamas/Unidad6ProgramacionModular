import java.util.Scanner;

public class Ejercicio8 {
//---

    String nombre;
    String[] palabrasA = new String[5]; //Arreglo de 5 palabras
    String[] palabrasB = new String[5]; //Arreglo de 5 palabras
    Scanner sc = new Scanner(System.in);

    //--- Constructor Ejercicio8
    public Ejercicio8(String nombre) {
        System.out.println(nombre);
        initEjercicio();
    }

    private void initEjercicio() {
        ingresarDatos(palabrasA, 1);
        ingresarDatos(palabrasB, 2);
        mostrarDatos(palabrasA, 1);
        mostrarDatos(palabrasB, 2);
    }

    public String[] ingresarDatos(String[] palabras, int indice){ //Rellenar el arreglo con palabras
        System.out.println("\n====    Palabras Arreglo "+(indice)+"  ====\n");
        for (int i = 0; i < 5; i++) {
            System.out.print("Paralabra No "+(i+1)+" : ");
            palabras[i] = sc.next();
        }
        return palabras;
    }

    public void mostrarDatos(String[] palabras, int indice){
        System.out.println("\n====    Palabras Almacenadas Arreglo "+(indice)+"  ====");
        for (int i = 0; i < 5; i++) {
            System.out.print(palabras[i]+" ,");
        }
    }

    public void comparacionArreglos(String[] palabrasA, String[] palabrasB){
        System.out.println("\n====    Comparacion de Arreglos   ====\n");
    }

    public static void main(String[] args) {
        //--- Código Ejecutable
        new Ejercicio8("Ejercicio 8");
    }
}
