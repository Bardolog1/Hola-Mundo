public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";  // eanque parece una declaracion, es un objeto, sin operador new
        String curso2 = new String("Programación Java");  // con operador new
        String curso3 = "PROGRAMaCIÓN java";

        boolean esIgual = curso == curso2;   // en este ejemplo comparativo va aser falso ya que la maquina va a comparar si son el mismo objeto
        System.out.println(esIgual);

        esIgual = curso.equals(curso2);   // esta es la forma correcta de comparar si dos cadenas de caracteres (String)  son iguales con el metodo equals()
        System.out.println(esIgual);  // con equals() debe ser totalmente iguales en cuanto acentos, espacios y si esta en mayusculas o minusculas

        esIgual = curso.equalsIgnoreCase(curso3); // con este m,etodo podemos comparar sin importar las masyuculas o minusculas
        System.out.println(esIgual);


    }
}
