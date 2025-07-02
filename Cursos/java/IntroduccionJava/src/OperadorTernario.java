import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        //Calcular si un numero es par o impar
    /*  System.out.println("*****Operación Ternaria*****");
        Scanner console= new Scanner(System.in);
        System.out.println("Ingrese un número");
        var numero= Integer.parseInt(console.nextLine());
       var resultado = ( numero % 2==0) ? "Es par": "Es impar";
        System.out.println("El número "+numero+" "+resultado);*/
        //Calcular si es mayor de edad
    /*    Scanner console= new Scanner(System.in);
        System.out.println("Ingrese un número");
        var edad= Integer.parseInt(console.nextLine());
        var resultado= (edad>=18)?"es mayor de edad":"es menor de edad";
        System.out.println("La persona "+resultado);*/
        //Calcular si un valor es positivo, negativo o cero
        var numero=-10;
        var resultado= (numero>0)? "El número es positivo":(numero<0)? "El número es negativo": "El número es cero";
        System.out.println(resultado);
    }
}
