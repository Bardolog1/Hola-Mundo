import java.util.Locale;
import java.util.Scanner;

public class OperadoresLogicosLoginArray {
    public static void main(String[] args) {

/*
        String [] userNames = new String[5];  // asi se instancia un nuevo arreglo, con los corchetes indicamos que es un arreglo de datos string, dentro de los doscorchetes se pone el numero de espacios a reservar en memoria
        String [] passWords = new String[5];

        userNames [0] = "Andres"; // aqui agregamos el primer dato del estring y le indicamos que va indexado en la posicion 0
        passWords [0] = "12345";
        userNames[1] = "admin";
        passWords [1] = "1234";
        userNames[2] = "Libardo";
        passWords [2] = "1023949631";
        userNames[3] = "Diana";
        passWords [3] = "1033750629";
        userNames[4] = "July";
        passWords [4] = "1013685699";
*/
        // otra forma de inicializar un arreglo
        String [] userNames = {"Andres","Admin","Libardo","Diana","July"};  // asi se instancia un nuevo arreglo, con los corchetes indicamos que es un arreglo de datos string, dentro de los doscorchetes se pone el numero de espacios a reservar en memoria
        String [] passWords = {"1234","12345","1023949631","1033750629","1013685699"};




        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el usuario");
        String u = scanner.next();

        System.out.println("Ingrese la contraseña");
        String p = scanner.next();

        boolean esautenticado = false;


        for (int i = 0; i < userNames.length; i++) {


            if(userNames[i].equalsIgnoreCase(u) && p.equalsIgnoreCase(passWords[i]) ){
                esautenticado = true;
                break; // salimos del for

            }



        }

        if(esautenticado){
            String user = u.toLowerCase();
            String pLetra = user.substring(0,1).toUpperCase(Locale.ROOT);
            String user1 =user.substring(1);
            String finalS = pLetra+user1;
            System.out.println("Bienvenido usuario ".concat(finalS));
            System.out.println("Acceso concedido "+esautenticado);


        }else {

            System.out.println("Lo siento, requiere autenticación");
            esautenticado= false;
            System.out.println(" No tiene Acceso o los datos no son correctos "+esautenticado);

        }
    }
}
