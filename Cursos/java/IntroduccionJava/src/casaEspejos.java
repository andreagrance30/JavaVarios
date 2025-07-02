import java.util.Scanner;

public class casaEspejos {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        System.out.println("Ingrese su edad");
        var edad= Integer.parseInt(console.nextLine());
        System.out.println("Te da miedo la oscuridad? (true/false)");
        var respuesta= Boolean.parseBoolean(console.nextLine());

        if (edad>=10 && !respuesta){
            System.out.println("Bienvenido a la Casa de los Espejos");
        }else {
            System.out.println("Lo sentimos no puede ingresar a la Casa ");
        }
    }
}
