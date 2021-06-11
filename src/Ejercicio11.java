import java.util.Scanner;

public class Ejercicio11 {
//---

    String[] nombres = new String[6]; //Nombres de los estudiantes
    double[] notas = new double[6]; //Notas de los estudiantes, pueden ser valores decimales
    Scanner sc = new Scanner(System.in);

    //--- Constructor Ejercicio11
    public Ejercicio11 (String nombre){
        System.out.println(nombre);
        initEjercicio();
    }

    private void initEjercicio() {
        ingresarNombre(nombres);
        ingresarNotas(notas);
        mostrarResultados(nombres, notas);
    }

    public String[] ingresarNombre(String[] nombres){
        System.out.println("\n====    Ingrese los nombres de los estudiantes   ====\n");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(" Estudiante No ["+i+"] : ");
            nombres[i] = sc.nextLine();
        }
        return nombres;
    }

    public double[] ingresarNotas(double[] notas){
        double nota;

        System.out.println("\n====    Ingrese las notas de los estudiantes   ====\n");
        for (int i = 0; i < notas.length; i++) {
                System.out.print("Nota estudiante No [" + i + "] : ");
                nota = sc.nextDouble();
                    if (verificarNotas(nota)) {
                        notas[i] = nota;
                    } else {
                        System.out.println("Ingresar Notas Validas");
                    }
        }
        return notas;
    }

    public String resultadoNota(double nota){
        String resultado = "";
        if (nota >= 0 && nota <= 4.99){
            resultado = "* Suspenso *";
        } else if (nota >= 5 && nota <= 6.99){
            resultado = "* Bien *";
        } else if (nota >= 7 && nota <= 8.99){
            resultado = "* Notable *";
        } else if (nota >= 9 && nota <= 10){
            resultado = "* Sobresaliente :c *";
        }

        return resultado;
    }

    public void mostrarResultados(String[] nombres,double[] notas){
        System.out.println("\n====    Resultados   ====\n");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Estudiante : "+nombres[i]+" || Nota : "+notas[i]+"  Resultado : "+resultadoNota(notas[i])+"\n");
        }

    }

    public boolean verificarNotas(double nota){
        if (nota >= 0 && nota <= 10){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        //--- Código Ejecutable
        new Ejercicio11("Ejercicio 11");
    }
}
