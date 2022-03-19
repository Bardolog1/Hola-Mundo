import java.util.Locale;

public class EjemploMetodosString {
    public static void main(String[] args) {
        String nombre= "Libardo";
        System.out.println("nombre.length()="+ nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Libardo\") = " + nombre.equals("Libardo"));
        System.out.println("nombre.equalsIgnoreCase(\"libardo\") = " + nombre.equalsIgnoreCase("libardo"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Libardo"));  // si es 0 son identicos
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres")); // segun el numero es el orden segun ordenamiento UNICODE
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); // recibe un numero entero que equivale a la posicion del caracter a buscar en este caso 0 equivaldria a L del String nombre
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(2) = " + nombre.charAt(2));
        System.out.println("nombre.charAt(3) = " + nombre.charAt(3));
        System.out.println("nombre.charAt(4) = " + nombre.charAt(4));
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(6) = " + nombre.charAt(6));

        //    en el caso de querer obtener el ultimo caracter de forma dinamico, modo tal que no sepaños cuantos caracteres tenga el string

        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));  // ponemos que reste uno ya que leng miestra cuantos caracteres tiene pero el socicionamiento de estos siempre va a ser un num inferior

        System.out.println("nombre.substring(1) = " + nombre.substring(1));  // generar un string apartir de otro cortando desde cierto caracter
        System.out.println("nombre.substring(1,5) = " + nombre.substring(1,5));  // se puede escojer un rango de caracteres para generar el nuevo string


        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));  // busca un caractere o caracteres y da su posicion, solo indica el primero encontrado
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));  // busca la ultima ocurrencia, los caracteres que no encuentre siempre va a dar como reultado una posicion negativa
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));  // solo aceta string y retorna un true o false
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));  // con este metodo podemos validar si un string inicia con determinado string
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas")); // validadmos si termina en determinado string, devuelve un booleano

        System.out.println("  trabalenguas ");  // comparacion para trim
        System.out.println("  trabalenguas ".trim());  // con este metodo eliminamos los espacios laterales





    }
}
