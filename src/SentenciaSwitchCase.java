import javax.swing.*;
public class SentenciaSwitchCase {
    public static void main(String[] args) {

        int mes =  Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de mes"));
        String mesS =null;

        switch (mes) {     // solo soporta algunos primitivos, String y la clase enum
            case 1:
                mesS="Enero";
                break;
            case 2:
                mesS="Febrero";
                break;
            case 3:
                mesS="Marzo";
                break;
            case 4:
                mesS="Abril";
                break;
            case 5:
                mesS="Mayo";
                break;
            case 6:
                mesS="Junio";
                break;
            case 7:
                mesS="Julio";
                break;
            case 8:
                mesS="Agosto";
                break;
            case 9:
                mesS="Septiembre";
                break;
            case 10:
                mesS="Octubre";
                break;
            case 11:
                mesS="Noviembre";
                break;
            case 12:
                mesS="Diciembre";
                break;

            default:
                mesS="El numero "+mes+" no es un numero de  correcto";

        }
        JOptionPane.showMessageDialog(null,mesS);
    }
}
