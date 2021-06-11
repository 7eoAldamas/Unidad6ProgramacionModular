import java.util.Scanner;

public class Ejercicio8 {
//---

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
        comparacionArreglos(palabrasA, palabrasB);
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
        System.out.println("\n\n====    Palabras Almacenadas Arreglo "+(indice)+"  ====");
        for (int i = 0; i < 5; i++) {
            System.out.print((i)+". ["+palabras[i]+"]  ");
        }
    }

    public void comparacionArreglos(String[] palabrasA, String[] palabrasB){
        System.out.println("\n\n====    Comparacion de Arreglos   ====\n");

        for (int i = 0; i < 5; i++) {

             int cantidad = palabrasA[0].length(); //Obtenemos el tamaño de la palabra en el índice 0 del arreglo A
             int cantidadB = palabrasB[i].length(); //Guardamos cada tamaño de todas las palabras del arreglo B

            if (cantidad == cantidadB){
                if (palabrasA[0].equals(palabrasB[i])){ //Comparamos si son iguales
                    System.out.println("Indice ["+i+"] - ["+palabrasB[i]+"] -- Si son iguales a --> " +
                            "["+palabrasA[0]+"] " + "| tamanio --> " +
                            "["+palabrasB[i].length()+"]");
                } else {
                    System.out.println("["+palabrasB[i]+"] es igual en tamanio pero no en valor --> " +
                            "["+palabrasA[0]+"] | tamanio --> " +
                            "["+palabrasB[i].length()+"]");
                }
            } else {
                System.out.println("["+palabrasB[i]+"] es diferente en tamanio a --> " +
                        "["+palabrasA[0]+"]");
            }

        }

    }

    public static void main(String[] args) {
        //--- Código Ejecutable
        new Ejercicio8("Ejercicio 8");
    }
}
