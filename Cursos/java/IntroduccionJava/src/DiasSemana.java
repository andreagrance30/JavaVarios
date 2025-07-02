public class DiasSemana {
    public static void main(String[] args) {
        System.out.println("***Días de la Semana***");
        var dia=5;
        switch (dia) {
            case 1:
                System.out.println("Día = " + dia + " Lunes");
                break;
            case 2:
                System.out.println("Día = " + dia + " Martes");
                break;
            case 3:
                System.out.println("Día = " + dia + " Miércoles");
                break;
            case 4:
                System.out.println("Día = " + dia+ " Jueves");
                break;
            case 5:
                System.out.println("Día = " + dia+" Viernes");
                break;
            case 6:
                System.out.println("Día = " + dia+ " Sábado");
                break;
            case 7:
                System.out.println("Día = " + dia + " Domingo");
                break;
            default:
                System.out.println("Día inválido " + dia);

        }
    }
}
