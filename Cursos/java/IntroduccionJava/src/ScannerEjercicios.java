import java.util.Scanner;
public class ScannerEjercicios {
    public static void main(String[] args) {
        var consola= new Scanner(System.in);
        int nu=10;

        System.out.print("Ingresa un valor entero: ");
    /*    var enteroString= consola.nextLine();
        var entero=Integer.parseInt(enteroString);*/
        var entero=Integer.parseInt(consola.nextLine());
     //   System.out.println("entero: "+ entero+nu);
        int suma=nu+entero;
        System.out.println("Se imprime el resultado de la suma de: "+nu+" + "+entero+" =" + suma);

    }
}
