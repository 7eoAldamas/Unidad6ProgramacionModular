import java.util.Scanner;

public class Ejercicio5 {
//---    

    int[] notas = new int[100];
    int cantidad = 0, total = 0;
    Scanner sc = new Scanner(System.in);

    //--- Constructor Ejercicio5
    public Ejercicio5 (String nombre){
        System.out.println(nombre);
        initEjercicio();
    }

    private void initEjercicio() {
        ingresarDatos();
        mostrarDatos();

    }

    public void ingresarDatos(){
        int temp = 0;
        System.out.println("\n====    Ingrese valores de 0 - 10   ====\n");
        System.out.println("Nota : para terminar de ingresar las notas, ingrese ' -50 '");
        for (int i = 0; i < 100; i++) {
            System.out.print("Nota  No. [" + i + "] : ");
            temp = sc.nextInt();
            if (temp != -50){
                notas[i] = temp;
                total+= temp;
                cantidad++;
            } else {
                break; //Rompemos - Terminamos de ingresar más datos
            }
        }
    }

    public void mostrarDatos(){
        System.out.println("El promedio es : "+calcularPromedio(total, cantidad));
    }

    public float calcularPromedio(int total, int cantidad){ //Calculamos el promedio
        float promedio = (total / (float)cantidad);
        return promedio;
    }

    public static void main(String[] args) {
        //--- Código Ejecutable
        new Ejercicio5("Ejercicio 5");
    }

}
