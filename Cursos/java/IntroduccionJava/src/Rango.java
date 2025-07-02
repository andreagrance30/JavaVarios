import java.util.Scanner;
public class Rango {
    public static void main(String[] args) {
         var consolaAnd= new Scanner(System.in);
        System.out.print("Ingrese un número aleatorio:");
         var ingresaValor= Integer.parseInt(consolaAnd.nextLine());
         var resultado = ingresaValor >=0 || ingresaValor >=10;
        System.out.println("El numero aleatorio se encuentra dentro del rango ?"+'\n'+
                            "resultado: "+ resultado);
    }
}
