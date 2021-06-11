import java.util.Scanner;

public class Ejercicio4 {
//---

    int[] numeros = new int[10]; //Arreglo de 10 elementos
    Scanner sc = new Scanner(System.in);

    //--- Constructor Ejercicio4
    public Ejercicio4 (String nombre){
        System.out.println(nombre);
        initEjercicio();
    }

    private void initEjercicio() {
        ingresarDatos();
        mostrarDatos(numeros);
        elementoMayor(numeros);

    }

    public int[] ingresarDatos(){ //Ingresamos los datos al arreglo
        for (int i = 0; i < 10; i++) {
            numeros[i] = (int)(Math.random()*100); //Números Aleatorios
        }
        return numeros;
    }

    public void mostrarDatos(int[] numeros){
        System.out.println("====    Valores Aleatorios   ====\n");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

    public void elementoMayor(int[] numeros){ //Buscar el elemento Mayor
        int mayor = numeros[0];               // Y las veces que se repite

        for (int i = 0; i < 10; i++) { //Hallar el valor más grande
            if (mayor < numeros[i]){
                mayor = numeros[i];
            }
        }

        System.out.println("\n\n====    Distancia entre el valor mayor   ====\n");
        for (int i = 0; i < 10; i++) { //Distancia entre los valores con el valor mayor
            numeros[i] = mayor - numeros[i];
            System.out.println("Dato ["+(i)+"] distancia --> " + numeros[i]);
        }

        System.out.println("\n\nEl mayor es : "+mayor);
    }

    public static void main(String[] args) {
        //--- Código Ejecutable
        new Ejercicio4("Ejercicio 4");
    }
}
