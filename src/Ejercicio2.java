public class Ejercicio2 {
//---

    String nombre;
    int[] numeros = new int[10]; //Arreglo de 10 elementos aleatorios

    //--- Constructor de Ejercicio2
    public Ejercicio2(String nombre) {
        System.out.println(nombre);
        initEjercicio();
    }

    private void initEjercicio() {
        ingresarDatos();
        mostrarDatos(numeros);
        elementoMayor(numeros);
    }

    public int[] ingresarDatos() { //Ingresamos los datos al arreglo
        for (int i = 0; i < 10; i++) {
            numeros[i] = (int)(Math.random()*100); //Números Aleatorios
        }
        return numeros;
    }

    public void mostrarDatos(int[] numeros){ //Recorremos y mostramos los datos del arreglo
        System.out.println("====    Valores Aleatorios   ====\n");
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]+" ");
        }
    }

    public void elementoMayor(int[] numeros){ //Buscar el elemento Mayor
        int mayor = numeros[0];               // Y las veces que se repite
        int contadorRepetidos = 0;

        for (int i = 0; i < 10; i++) { //Hallar el valor más grande
            if (mayor < numeros[i]){
                mayor = numeros[i];
            }
        }

        for (int i = 0; i < 10; i++) { //Contar las veces que se repite el valor mayor
            if (mayor == numeros[i]){
                contadorRepetidos++;
            }
        }

        System.out.println("\n\nEl mayor es : "+mayor);
        System.out.println("El mayor se repite : "+contadorRepetidos);
    }

    public static void main(String[] args) {
        //--- Código Ejecutable
        new Ejercicio2("Ejercicio 2");
    }

}
