import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
         String usuario ="Andrea";
         String contraseña= String.valueOf(123456);
        Scanner console= new Scanner(System.in);

        System.out.println("Ingrese Usuario");
        var usuarioIngresado= console.nextLine();
        System.out.println("Ingrese Contraseña");
        String constraseñaIngresada= console.nextLine();
        var resultado= usuarioIngresado.equals(usuario) && constraseñaIngresada.equals(contraseña);


        System.out.println("Usuario correcto:" + resultado);
    }
}
