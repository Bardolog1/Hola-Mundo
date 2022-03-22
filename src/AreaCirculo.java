import javax.swing.*;

public class AreaCirculo {
    public static void main(String[] args) {

        try {


            double radio = 0.0;

            radio = Double.parseDouble(JOptionPane.showInputDialog
                    (null, "Ingrese el radio del circulo"));

            double area = Math.PI * (Math.pow(radio, 2.0));
            area = Math.round(area);
            JOptionPane.showMessageDialog(null, "El círculo con radio de " + radio + " cm..." + "\n" + "\nTiene un área de " + area + " Cm2 \nAproximadamente.");
            System.exit(0);
        }catch (Exception e){

            System.err.println("error del sistema= "+e.getMessage());
            System.exit(1);

        }
    }
}
