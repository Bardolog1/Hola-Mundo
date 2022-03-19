public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5; // aqui usamos uno que es el = ya que le asignamos el numero 5 a la variable i

        i=i+2;  //esta es la forma no reducida

        i+=2;  // esta es la forma combinada de laq anterior
        i-=4;  // igial a i=i-4


        String sqlstring = "select * from clientes as c ";
        sqlstring+="where c.nombre='Andres'";
        sqlstring+="and c.activo=1";

        System.out.println("sqlstring = " + sqlstring);
    
    }
}
