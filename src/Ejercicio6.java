public class Ejercicio6 {
//---

    int[][] datos = {{5, 6, 13}, {14, 2, 4}, {21, 7, 6}}; //Elementos de la matriz (3*3)

    //--- Constructor Ejercicio6
    public Ejercicio6 (String nombre){
        System.out.println(nombre);
        initEjercicio();
    }

    private void initEjercicio() {
        mostrarDatos(datos);
        multiplicarArreglo(datos);
    }

    public void mostrarDatos(int[][] datos){ //Recorremos y mostramos los valores del arreglo
        System.out.println("====    Matriz   ====\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+datos[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public void multiplicarArreglo(int[][] datos){ //Multiplicamos cada valor del arreglo por 2
        System.out.println("\n\n====    Matriz multiplicada por el valor de 2   ====\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+(datos[i][j]*2) + "]");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //--- Código Ejecutable
        new Ejercicio6("Ejercicio 6");
    }
}
