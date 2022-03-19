public class EjemploMetodosStringArreglos {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));  // busca un caractere o caracteres y da su posicion, solo indica el primero encontrado
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));  // busca la ultima ocurrencia, los caracteres que no encuentre siempre va a dar como reultado una posicion negativa
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));  // solo aceta string y retorna un true o false
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));  // con este metodo podemos validar si un string inicia con determinado string
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas")); // validadmos si termina en determinado string, devuelve un booleano

        System.out.println("  trabalenguas ");  // comparacion para trim
        System.out.println("  trabalenguas ".trim());  // con este metodo eliminamos los espacios laterales


        // empezamos con el arreglo array

        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray()); // al mostrarlo  en consola solo va a mostrar el identificador de la instancia  para mostrar los datos se hace mediante ciclos for

        char[] aqrregloTrabalenguas =   trabalenguas.toCharArray();
        int largo = trabalenguas.length();
        for (int i=0; i<largo; i++){
            System.out.println(aqrregloTrabalenguas[i]); // imprime dando saltos de linea ya que println hace un salto de linea cada que imprime

        }
        for (int i=0; i<largo; i++){
            System.out.print(aqrregloTrabalenguas[i]); // el metodo print de system imprime en la misma linea

        }

        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a")); // hace arreglos cortando por el parametro pasado al metodo slip , pero al imprimirlo en consola solo nos muestra el identificador de la instancia
        String [] splittt = trabalenguas.split("a");  // se crea un arreglo de strings para ir llamada a cada uno de los cortes realizados al string principal
        int l = splittt.length;

        for (int i =0; i<l;i++){
            System.out.println(splittt[i]);


        }


        // cortar extension

        String archivo3 = "un_archivo_cualquiera.pdf";
        String [] archivoArr = archivo3.split("\\.");
        int ll = archivoArr.length;

        for (int i=0; i<ll;i++){

            System.out.println(archivoArr[i]);


        }
        System.out.println("Extensión = " + archivoArr[ll-1]);  // -1 ya que el valor de ll empieza desde 1 y los index desde 0









    }
}
