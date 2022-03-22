class Persona {  // para la creacion de clases se recomienda hacerlo en un archivo individual, solo por este ejemplo lo hacemos asi
    private String nombre;

    /* el atributo de una clase cuenta
    con tres partes: 1. la visibilidad o
    modificador de acceso,2. el tipo 3. el
    nombre, en este caso private es que es
    de uso privado solo de la clase y no se p
    uede acceder a el desde ninguna otra clase y
    si es publico puedo llamar al atributo desde
    cualquier parte del codigo, lo recomendable
    es que los atributos sean privados y solo se
    pueda acceder a ellos mediante metodos
     */
    public void modificarNombre(String nuevoNom) {  // este es un metodo que modifica el atributo de la clase, es publico y void es decir que no retorna nada, solo modifica
        this.nombre = nuevoNom;  // this se usa ´para idicar que se refiere a un atributo o elemento que esta dentro de la clase
    }

    public String mostrarNombre() {  // metodo para mostrar el nombre
        return this.nombre; // retornamos el valor contenido en nombre junto con el this para indicar que es de esa clase
    }

    /* se pueden modificar los datos de una
    instancia distinta solo si son clases
    diferentes a las wrapper, enn este caso
    modificaremos una clase creada por nosotros mismos
     */
    public class PasarPorReferencia2 {
        public static void main(String[] args) {

        /*
        En este ejemplo veremos que son mutables
        por referencia o clases u objetos a diferencia a
        los datos por valor y los wrapper
        * */
            Persona persona = new Persona();  // creamos un objeto de la clase persona
            persona.modificarNombre("Andres"); // le asignamos un nombre a la persona

            System.out.println("iniciamos el metodo main");
            System.out.println("Antes de llamar al metodo test")
            ;
            System.out.println(" Persona= " + persona.mostrarNombre());  // si queremos ver el nombre de persona y ponemos persona.nombre no podremos ya que es un atributo privado


            test(persona);

            System.out.println("Despues de llamar al metodo test");
            System.out.println(" Persona= " + persona.mostrarNombre());  // si queremos ver el nombre de persona y ponemos persona.nombre no podremos ya que es un atributo privado
            System.out.println("Finaliza el metodo main con los datos de la referencia modificados ");

        }

        public static void test(Persona persona) {   // se crea una nueva instancia de i
            System.out.println("Iniciamos el método test ");
            persona.modificarNombre("pepe");
            System.out.println("Finaliza el método test  ");
        }
    }
}

