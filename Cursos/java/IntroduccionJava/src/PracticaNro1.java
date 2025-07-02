public class PracticaNro1 {
    public static void main(String[] args) {
        var nombre="  Andrea Noemi Salinas ";
        var nombre_normalizado=nombre.toLowerCase().replace(" ",".");
        var empresa="Ferreteria Grance";
        var extension=".com.mx";
        var dominioNormalizado="@"+empresa.toLowerCase().replace(" ",".")+extension;


        System.out.println("***Generador de Mail***"+"\n"+
                "Nombre Usuario:"+" "+nombre.strip()+"\n"+
                "Nombre Usuario Normalizado:"+" "+nombre_normalizado+"\n"+
                "Nombre Empresa:"+" "+empresa+"\n"+
                "Extensión del Dominio:"+" " + extension+"\n"+
                "Dominio de Email normalizado:"+" " + dominioNormalizado +"\n"+
                "Email Final Generado:"+" " +nombre_normalizado+dominioNormalizado
        );
        /*Aprendizaje
        Método Strip es utilizado para limpiar los espacios al inicio y final de la
        variable nombre
         */
    }
    }

