import java.util.Scanner;

public class EstacionAño {
    public static void main(String[] args) {
        Scanner consola= new Scanner(System.in);
        System.out.println("Favor ingrese numero:");
        var numero= Integer.parseInt(consola.nextLine());
        var estacion="";
       if (numero==1 || numero==2 || numero==12){
            estacion="INVIERNO";
        } else if (numero==3 || numero==4 || numero==5) {
           estacion="PRIMAVERA";
       }else if (numero==6 || numero==7 || numero==8) {
           estacion="VERANO";
       }else if (numero==9 || numero==10 || numero==11) {
           estacion="OTOÑO";
       }else {
           estacion="una estación desconocida";
       }
        System.out.println("El mes: "+numero+" es "+estacion);
    }
}
