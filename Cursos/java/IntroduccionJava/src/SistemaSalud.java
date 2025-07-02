import java.util.Scanner;

public class SistemaSalud {
    public static void main(String[] args) {
        System.out.println("***Sistema de Control de Pasos***");
        Scanner console= new Scanner(System.in);
        final var meta_pasos= 10000;
        final var calorias_pasos=0.04;
        var calorias_quemadas_meta= meta_pasos*calorias_pasos;
        System.out.print("Favor ingrese su nombre:");
        var nombre= console.nextLine();
        System.out.print("Favor ingrese el numero de pasos:");
        var pasos= Integer.parseInt(console.nextLine());

        var resultadoIngresado= pasos*calorias_pasos;
        var resultadoFinal= (pasos>=meta_pasos)? "Si :)" : "No :(";
        System.out.println("resultadoFinal = " + resultadoFinal);
        System.out.printf("""
                %nNombre: %s
                Cantidad de Pasos: %d
                Calorías quemadas: %.2f kcal
                Ha alcanzado la meta ?: %s
                Meta de Pasos diarios: %d pasos
                """, nombre, pasos,resultadoIngresado, resultadoFinal,meta_pasos );
    }
}
