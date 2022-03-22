import java.io.FileInputStream;
import java.util.Properties;

public class EjemploAsignarPropiedadesDelSistema {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream ("src/config.properties");
            Properties pro = new Properties(System.getProperties());
            pro.load(archivo);
            pro.setProperty("mi.propiedad.presonalizada","mi valor en mi config");


            System.getProperties().list(System.out); // aun no van a estar cargadas nuestras propiedades
            System.out.println("=/=/=/=/=/=/=//=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=//==/= ");
            System.setProperties(pro); // cargamos nuestras propiedades
            System.getProperties().list(System.out); // aun no van a estar cargadas nuestras propiedades
            System.out.println("=/=/=/=/=/=/=//=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=//==/= ");


        }catch (Exception e){

            System.err.println("No existe el archivo= " + e.getMessage());  // aqui usamos un metodo de system que se llama err y se usa igual que OUT pero imprime como un error en consola, color rojo
            System.exit(1);
        }
        }
}
