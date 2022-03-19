import javax.swing.*;
public class SentenciaIfElseAñoBiciesto {
    public static void main(String[] args) {
        try {
            String me = JOptionPane.showInputDialog(null, "Ingrese el numero de mes");
            int mes = Integer.parseInt(me);
            int numeroDias = 0;
            String anno = JOptionPane.showInputDialog(null, "Ingrese el año");
            int anio = Integer.parseInt(anno);

            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) numeroDias = 31;
            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) numeroDias = 30;
            else if (mes == 2) {

                if (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)) {
                    JOptionPane.showMessageDialog(null, anio + " es un año bisiesto");
                    numeroDias = 29;
                } else if (anio % 400 != 0 || (anio % 4 != 0 || anio % 100 == 0)) {
                    System.out.println();
                    JOptionPane.showMessageDialog(null, anio + " no es un año bisiesto");
                    numeroDias = 28;
                }

            } else System.out.println("Ingrese el numero de mes correcto");

            JOptionPane.showMessageDialog(null, "El mes " + mes + " del año " + anio + " tiene " + numeroDias + " dias");
            System.exit(0);

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Porfavor solo ingrese valores numericos");
            main(args);
            System.exit(0);
        }
    }
}
