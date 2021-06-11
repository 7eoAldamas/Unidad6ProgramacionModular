public class Ejercicio7 {
//---

    final int FILAS = 4;
    final int COLUMNAS = 3;
    int[][] aleatorios = new int[FILAS][COLUMNAS]; //Arreglo de 4*3 (Matriz)

    //--- Constructor Ejercicio7
    public Ejercicio7 (String nombre){
        System.out.println(nombre);
        initEjercicio();
    }

    private void initEjercicio() {
        ingresarDatos();
        mostrarDatos(aleatorios);
        sumaFilaPar(aleatorios);
    }

    public void ingresarDatos(){ //Ingresamos los datos al arreglo
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                aleatorios[i][j] = (int)(Math.random()*555)+1;
            }
        }
    }

    public void mostrarDatos(int[][] aleatorios){ //Recorremos y mostramos el arreglo
        System.out.println("====    Matriz   ====\n");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print("["+aleatorios[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public void sumaFilaPar(int[][] aleatorios){
        int suma = 0;
        System.out.println("\n====    Suma Filas Pares   ====\n");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if ((i % 2) == 0 ) { //Si la fila es par
                    suma += aleatorios[i][j]; //Sumar los valores de esas filas
                }
            }
        }

        System.out.println("Suma de todos los numeros en filas pares = " + suma);

    }

    public static void main(String[] args) {
        //--- Código Ejecutable
        new Ejercicio7("Ejercicio 7");
    }

    /*
    Ejemplo --------------

    [496][62][363] Fila Par --> Suma1
    [377][233][385] Fila Impar
    [45][270][376] Fila Par --> Suma2
    [201][331][266] Fila Impar

    sumaTotal = Suma1 + Suma2;
     */

}
