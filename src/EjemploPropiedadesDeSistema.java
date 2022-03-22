import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workSpace = System.getProperty("user.dir");
        System.out.println("workSpace = " + workSpace);

        String version = System.getProperty("java.version");
        System.out.println("version = " + version);
        
        String saltoLinea = System.getProperty("line.separator");
        System.out.println("saltoLinea = " + saltoLinea+"Nueva línea");

        Properties p = System.getProperties();  // ver todas las propiedades
        p.list(System.out);


    }
}
