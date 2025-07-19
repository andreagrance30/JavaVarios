import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        final var costNac= 10;
        final var costInt=20;

        System.out.println("***Sistema de Envíos***");
        Scanner consola= new Scanner(System.in);
        System.out.println("Ingresa el destino del paquete(nacional/internacional)");
        var destino= consola.nextLine().strip();
        System.out.println("Ingresa el peso del paquete(en Kg.)");
        var peso= Double.parseDouble(consola.nextLine());
      ///  Double costoFinal=0.0;
     /*   if (destino.equals("nacional")) {
            costoFinal=peso*costNac;
        } else if (destino.equals("internacional")) {
            costoFinal = peso*costInt;
        }*/
      Double costoFinal= switch (destino){
            case "nacional" -> peso*costNac;
            case "internacional" -> peso*costInt;
            default -> {
                System.out.println("Destino Invalido");
                yield null;
            }
        };
      if (costoFinal!=null)
        System.out.printf("El costo del envío del paquete es: $%.2f ", costoFinal);
    }
}
