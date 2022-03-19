import java.util.Locale;
import java.util.Scanner;

public class OperadoresLogicosLoginArrayTernario {
    public static void main(String[] args) {
        String [] userNames = {"Andres","Admin","Libardo","Diana","July"};
        String [] passWords = {"1234","12345","1023949631","1033750629","1013685699"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario");
        String u = scanner.next();
        System.out.println("Ingrese la contraseña");
        String p = scanner.next();

        boolean esautenticado = false;

        for (int i = 0; i < userNames.length; i++) {
        esautenticado = (userNames[i].equalsIgnoreCase(u) && p.equalsIgnoreCase(passWords[i]))? true : esautenticado;
        }
        String user = u.toLowerCase();
        String pLetra = user.substring(0,1).toUpperCase(Locale.ROOT);
        String user1 =user.substring(1);
        String finalS = pLetra+user1;
        String mensaje = esautenticado? "Bienvenido ".concat(finalS).concat(" !").concat("\n").concat("Acceso concedido ")
                : "Lo sentimos, ".concat(finalS) .concat(" requiere autenticación").concat("\n").concat("No tiene Acceso o los datos no son correctos");
        System.out.println(mensaje);


    }
}
