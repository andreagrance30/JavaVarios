import java.util.Scanner;

public class tienda {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Es usted miembro?(true/false)" );
        var miembro= Boolean.parseBoolean(console.nextLine());
        System.out.println("Ingrese monto de la compra ");
        Double monto= Double.parseDouble(console.nextLine());
        //Ejemplo mas rapido
        double descuento=0;
        if (miembro && monto>1000){
             descuento= 0.1;
        } else if (miembro) {
            descuento= 0.05;
        }
        if (descuento!=0){
        var descuentoCal= monto*descuento;
        var compraFinal= monto-descuentoCal;

        System.out.printf("""
                        Monto de la compra:Gs.%.0f
                        Monto del descuento: Gs.%.0f
                        Monto del total a pagar: Gs.%.0f
                        """, monto,descuentoCal,compraFinal);
        } else {
            System.out.println("El monto de su compra es:" + monto);
            System.out.println("No se ha aplicado ningún descuento");
        }


        //Andrea
      /*  if (miembro.equals("si") && monto>1000){
            var des10= (monto*10)/100;
            var compraDes10= monto-des10;
            System.out.println("El monto de su compra es:" + monto);
            System.out.println("El descuento aplicado del 10%:" + des10);
            System.out.println("El total a pagar menos el descuento del 10% es :" + compraDes10);
        } else if (miembro.equals("si") && monto<1000) {
            var des5= (monto*5)/100;
            var compraDes5= monto-des5;
            System.out.println("El monto de su compra es:" + monto);
            System.out.println("El descuento aplicado del 5%:" + des5);
            System.out.println("El total a pagar menos el descuento del 5% es :" + compraDes5);
        }else{
            System.out.println("El total a pagar es:" + monto);
        } */
    }
}
