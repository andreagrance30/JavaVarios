import java.util.Scanner;

public class CalcularAreaPerimetro {
    public static void main(String[] args) {

        Scanner console= new Scanner(System.in);
        System.out.println("Ingresar base del Rectángulo= ");
        var base= Integer.parseInt(console.nextLine());
        System.out.println("Ingresar altura del Rectángulo= ");
        var altura= Integer.parseInt(console.nextLine());
        var area=base*altura;
        var perimetro= (base+altura)*2;
        System.out.println("area = " + area);
        System.out.println("perimetro = " + perimetro);
    }
}
