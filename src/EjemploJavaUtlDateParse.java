import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtlDateParse {
    public static void main(String[] args) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");  // debe cumplir este formato
        try {
            String anio=JOptionPane.showInputDialog(null, "Ingrese el año");
            String mes=JOptionPane.showInputDialog(null, "Ingrese el mes");
            String dia =JOptionPane.showInputDialog(null, "Ingrese el dia");
            Date fecha = formato.parse(anio+"-"+mes+"-"+dia);
            System.out.println("fecha = " + fecha);
            System.out.println("formato = " + formato.format(fecha));
            JOptionPane.showMessageDialog(null,formato.format(fecha));

            //comparara fechas

            Date fecha2 = new Date();
            if (fecha.after(fecha2)) {
                JOptionPane.showMessageDialog(null, "Fecha del usuario es posterior a la fecha actual");

            }else if (fecha.before(fecha2)) {

                JOptionPane.showMessageDialog(null, "Fecha del usuario es anterior a la fecha actual");
            }else if (fecha.equals(fecha2)){
                JOptionPane.showMessageDialog(null, "Es la misma fecha que la actual");
            }else JOptionPane.showMessageDialog(null,"Ha ocurrido algun error");

            // otra forma de comparar


            if (fecha.compareTo(fecha2)>0) {
                JOptionPane.showMessageDialog(null, "Fecha del usuario es posterior a la fecha actual");

            }else if (fecha.compareTo(fecha2)<0) {

                JOptionPane.showMessageDialog(null, "Fecha del usuario es anterior a la fecha actual");
            }else if (fecha.compareTo(fecha2)==0){
                JOptionPane.showMessageDialog(null, "Es la misma fecha que la actual");
            }else JOptionPane.showMessageDialog(null,"Ha ocurrido algun error");






        }catch (Exception e){
            e.printStackTrace();

        }

    }
}
