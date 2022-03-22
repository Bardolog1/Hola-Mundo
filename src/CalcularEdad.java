import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalcularEdad {
    public static void main(String[] args) {
        Date fecha = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {

            String fechaUser = JOptionPane.showInputDialog(null, "Ingrese su fecha de nacimiento\n formato: yyyy-mm-dd");
            Date fechaForm= format.parse(fechaUser);

            Long edad = fecha.getTime()- fechaForm.getTime();
            edad/=1000; // milisegundos  en 1 seg = 1000
            edad/=60; //segundos en 1 min = 60
            edad/=60;//minutos en 1 hora=60
            edad/=24;//horas en un dia = 24
            edad/=365;//dias en un año = 365

            JOptionPane.showMessageDialog(null,"Su edad es: "+edad);

        }catch (Exception e){

            JOptionPane.showMessageDialog(null,"Ha ingresado un valor con error");
            main(args);
            System.exit(0);

        }
    }


}
