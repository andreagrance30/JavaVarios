import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        final var cuartoSin=150.50;
        final var cuartoCon=190.50;
        System.out.println("***Sistema de Reserva del Hotel***");
        Scanner consola= new Scanner(System.in);
        System.out.println("Nombre del cliente:");
        var cliente= consola.nextLine();
        System.out.println("Días de estadía:");
        var dias=Integer.parseInt(consola.nextLine());
        System.out.println("Con vista al mar (true/false)");
        var mar= Boolean.parseBoolean(consola.nextLine());

        var costoTotal= (mar)? (dias*cuartoCon):(dias*cuartoSin);

        System.out.printf("""
                %n *** Detalles de la Reservación***
                Cliente: %s
                Días de estadía: %d
                Costo Total: %.2f;
                Habitación con vista al mar: %s
                """, cliente, dias,costoTotal,mar?"Si :)": "No :(");
    }
}
