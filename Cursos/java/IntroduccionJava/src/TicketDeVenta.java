import java.util.Scanner;

public class TicketDeVenta {
    public static void main(String[] args) {
        System.out.println("**** Ticket de venta***");
        var console= new Scanner(System.in);

        System.out.println("Ingrese el precio del tomate");
        var precioTomate= Double.parseDouble(console.nextLine());

        System.out.println("Ingrese el precio de la cebolla");
        var precioCebolla= Double.parseDouble(console.nextLine());

        System.out.println("Desea aplicar descuento?%");
        var descuento= Double.parseDouble(console.nextLine());

        Double resultado= precioTomate+precioCebolla;
        var calculoDes= (resultado*descuento)/100;
                /// Total con descuento
        var totalmasDescuento= resultado-calculoDes;
        System.out.println("El total es: "+resultado);
        System.out.println("El total con descuento es: "+totalmasDescuento);
        var impuesto= totalmasDescuento* 0.16;
        var totalCompra= totalmasDescuento+impuesto;

        System.out.printf(""" 
                totalCompra : $%.2f
                Total con Descuento :$%.2f
                Descuento : $%.2f
                Total con Impuesto: $%.2f""",resultado,totalmasDescuento,descuento, totalCompra);
    }
}
