public class NumerosPares {
    public static void main(String[] args) {
        System.out.println("*** Numeros Pares ***" );
        var contador= 1;

       /* while (contador <= 20){
            if(contador%2==0){
                System.out.printf(contador+ " ");
            }
            contador++;
        } */

        // DO WHILE

        do {
            System.out.println(contador);
            contador++;
        }while (contador<=20);

    }
}
