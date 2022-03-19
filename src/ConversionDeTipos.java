public class ConversionDeTipos {

    public static void main(String[] args) {

        String numeroST = "8"; //cadena a entero
        int numero = Integer.parseInt(numeroST);
        System.out.println(numero);

        String realST = "25481.12"; //cadena a real doble
        double realDouble = Double.parseDouble(realST);
        System.out.println(realDouble);

        String realDoubleNotaCient = "98764.43e-3";   // cadena notacion cientifica a real
        double realDoubleNC = Double.parseDouble(realDoubleNotaCient);
        System.out.println(realDoubleNC);

        String logicoST = "true";  // Cadena a booleano
        boolean logicoBoolean = Boolean.parseBoolean(logicoST);
        System.out.println(logicoBoolean);
        // Primitivos a cadenas

        int otroInt = 45;

        String otroST = Integer.toString(otroInt);  // entero a cadena
        System.out.println(otroST);
        otroST = String.valueOf(otroInt);  // otra forma de entero a cadena  aqui se puede hacer operaciones de suma dentro de los parametros, tener cuidado ya que si se ingresa un string lo acepta y concatena los datos
        System.out.println(otroST);

        double otroRealD = 123451.2d;

        String otroSTreal = Double.toString(otroRealD);
        System.out.println(otroSTreal);
        otroSTreal = String.valueOf(otroRealD);
        System.out.println(otroSTreal);

        // primitivos a primitivos ( riesgo de perdida de datos si se convierte de un tipo grande a pequeño )
        int i = 5 ;
        short s =(short) i;   // se forza la converción mediante (short) dado que int es mas grande que short y hay riesgo de perdida de datos por el tamañado de cada tipo
        long l = i; // no marca error dado que es mas grande de int y no hay riesgo de perdida de datos
        System.out.println(i);
        System.out.println(s);
        System.out.println(l);

    }
}
