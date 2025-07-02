import java.util.Scanner;

public class IngresoSistema {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Desea salir del sistema? (true/false) ");
        var ingreso= Boolean.parseBoolean(consola.nextLine());
        if(!ingreso){
            System.out.println("Usted continua en el Sistema");
        }else {
            System.out.println("Saliendo del sistema");
        }
    }
}
