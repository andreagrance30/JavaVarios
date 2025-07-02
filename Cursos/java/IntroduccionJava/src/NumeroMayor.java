import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner consola= new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese segundo numero: ");
        var numero2 = Integer.parseInt(consola.nextLine());

        var resultado= (numero1>numero2)? "El numero "+numero1+" es mayor a "+numero2: "El numero "+numero2+" es mayor a "+numero1;
        System.out.println("resultado = " + resultado);
    }
}
