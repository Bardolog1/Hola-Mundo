public class EjemploValidarString {
    public static void main(String[] args) {

        String curso = null;



        boolean esNulo = curso == null; // validamos si es nulo
        System.out.println("es nulo="+esNulo); // al utilizar el objeto string concatenado con el oerador de suma no genera error

        if (esNulo){
            curso="  de programacion";
            System.out.println("Se agregara un valor en cadena al objeto String que se encuentra nulo");
        }



        boolean esVacio=curso.length()==0;  // se cuentan los caracteresa  con este metodo
        System.out.println("esVacio = " + esVacio);

        if(!esVacio) {
            System.out.println("Bienvenido al curso"+curso.toUpperCase());  // es true ya que es nulo
            System.out.println("Bienvenido al curso".concat(curso)); // al ser nulo no podemos llamar a ningun metodo del objeto ya que no hay referencia definida dentro de él y va a arrojar el error NullPointerException
        }




        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);  //con este metodo se valida que la cadena tenga caracteres

        if(!esVacio2) {
            System.out.println("Bienvenido al curso"+curso.toUpperCase());  // es true ya que es nulo
            System.out.println("Bienvenido al curso".concat(curso)); // al ser nulo no podemos llamar a ningun metodo del objeto ya que no hay referencia definida dentro de él y va a arrojar el error NullPointerException
        }





        boolean esBlanco = curso.isBlank(); // se valida si es null o que tiene un espacio en blanco, solo disponible para versiones de JDK posteriores a la version 11 (CUIDADO)
        System.out.println("esBlanco = " + esBlanco);

        if(!esBlanco) {
            System.out.println("Bienvenido al curso"+curso.toUpperCase());  // es true ya que es nulo
            System.out.println("Bienvenido al curso".concat(curso)); // al ser nulo no podemos llamar a ningun metodo del objeto ya que no hay referencia definida dentro de él y va a arrojar el error NullPointerException
        }


    }

}
