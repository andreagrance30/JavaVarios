import java.util.Scanner;
public class NumeroPositivo {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        System.out.println("Ingrese numero = ");
        int numero = Integer.parseInt(console.nextLine());

        if(numero>0){
            System.out.println("El  número es positivo");
        } else if (numero<0) {
            System.out.println("El  número es negativo");
        }else {
            System.out.println("El  número es cero");
        }
        }
    }
