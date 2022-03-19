import javax.swing.*;
public class SistemasNumericos {

    public static void main(String[] args) {

        String numeroSt = JOptionPane.showInputDialog(null, "ingrese un numero entero");
        int numeroDecimal = 0;


        try {   // el try es tratar de ejecutar un codigo, se ejecutan cuando puede romperse el codigo y por ende toda la aplicación se utiliza para prevenir errores

            numeroDecimal = Integer.parseInt(numeroSt);

            } catch (NumberFormatException e){   // el catch atrapa el error

                JOptionPane.showMessageDialog(null, "ERROR !! \nDebe ingresar un numero entero");
                main(args);  // reiniciamos la funcion principal
                System.exit(0);  // salir del sistema con estatus 0 qeu signuifica que todo esta bien
             }
         /*
        int numeroOctal = 0764; // para indicar que es octal y no entero se antepone un numero cero
        int numeroBinario = 0b111110100; // para decirle a la maquibna virtual de java que no es un entero sino que es un binario se antepone el cero y la letra b  asi 0b
        int numeroHexadedimal = 0x1f4; // para indicar que es un haxadecimal y no un entero se debe anteponer el numero  cero y una x 0x


        //Conversiones

        System.out.println("numero Binario  de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        System.out.println("numero octal de =" + numeroDecimal+ " = "+ Integer.toOctalString(numeroDecimal));
        System.out.println("numero hexadecimal de = " + numeroDecimal + " = "+ Integer.toHexString(numeroDecimal));
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        //Presentación de datos

        System.out.println("Decimal");
        System.out.println("500  = "+ numeroDecimal);
        System.out.println(" ");
        System.out.println("Binario");
        System.out.println("111110100 = " + numeroBinario);
        System.out.println(" ");
        System.out.println("Octal");
        System.out.println("0764   = " + numeroOctal);
        System.out.println(" ");
        System.out.println("Haxadecimal");
        System.out.println("1f4 = " + numeroHexadedimal);
        System.out.println(" ");
        */

        String mensaje="Tu numero en  Decimal es = "+ numeroDecimal;
        mensaje += "\nTu numero en Binario es = " + Integer.toBinaryString(numeroDecimal);  // el \n es para hacer un salto de linea
        mensaje += "\nTu numero en Octal es = "+ Integer.toOctalString(numeroDecimal);
        mensaje += "\nTu numero en Hexadecimal es = " + Integer.toHexString(numeroDecimal);
        JOptionPane.showMessageDialog(null,mensaje);
    }

}
