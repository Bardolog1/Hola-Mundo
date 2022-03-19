import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        String  userName= "Andres";
        String password = "12345";
        String userName2 = "admin";
        String password2 = "1234";
        String [] userNames = new String[5];  // asi se instancia un nuevo arreglo, con los corchetes indicamos que es un arreglo de datos string, dentro de los doscorchetes se pone el numero de espacios a reservar en memoria
        String [] passWords = new String[5];
        userNames [0] = "Andres"; // aqui agregamos el primer dato del estring y le indicamos que va indexado en la posicion 0
        passWords [0] = "12345";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el usuario");
        String u = scanner.next();

        System.out.println("Ingrese la contraseña");
        String p = scanner.next();

        boolean esautenticado = false;

        if(u.equalsIgnoreCase(userName) && p.equalsIgnoreCase(password) ||
                u.equalsIgnoreCase(userName2) && p.equalsIgnoreCase(password2) ){
            esautenticado = true;
        }else {
            esautenticado= false;
            System.out.println(" No tiene Acceso o los datos no son correctos "+esautenticado);
        }

        if(esautenticado){
            String user = u.toUpperCase();
            System.out.println("Bienvenido usuario ".concat(user));
            System.out.println("Acceso concedido "+esautenticado);


        }else {

            System.out.println("Lo siento, requiere autenticación");

        }
    }
}
