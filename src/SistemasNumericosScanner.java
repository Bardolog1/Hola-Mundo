import java.util.Scanner;
import java.util.InputMismatchException;
public class SistemasNumericosScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un Entero =" );
        //String numeroSt = scanner.nextLine();
        int numeroDecimal = 0;

        try {   // el try es tratar de ejecutar un codigo, se ejecutan cuando puede romperse el codigo y por ende toda la aplicación se utiliza para prevenir errores
            numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroSt);
            } catch (InputMismatchException e){   // el catch atrapa el error
                System.out.println("ERROR !! \nDebe ingresar un numero entero");
                main(args);  // reiniciamos la funcion principal
                System.exit(0);  // salir del sistema con estatus 0 qeu signuifica que todo esta bien
        }

        String mensaje="Tu numero en  Decimal es = "+ numeroDecimal;
        mensaje += "\nTu numero en Binario es = " + Integer.toBinaryString(numeroDecimal);  // el \n es para hacer un salto de linea
        mensaje += "\nTu numero en Octal es = "+ Integer.toOctalString(numeroDecimal);
        mensaje += "\nTu numero en Hexadecimal es = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensaje);

    }

}
