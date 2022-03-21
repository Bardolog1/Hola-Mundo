import javax.swing.*;

public class SistemaNotas {
    public static void main(String[] args) {
        double notas = 0;
        int contadorNotas5=0;
        int contadorNotas4=0;
        int contadorNotas1=0;
        double sumaNotas5=0;
        double sumaNotas4=0;
        double sumaNotasTotal=0;
        double promNotas5=0;
        double promNotas4=0;
        double promNotasTotaL=0;
        try {

            for (int i = 0; i < 20; i++) {
                notas = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota numero: " + (i + 1)));
                if (notas >=5 && notas<=7) {
                    contadorNotas5++;
                    sumaNotas5 += notas;
                } else if (notas<= 4 && notas!=1) {
                    contadorNotas4++;
                    sumaNotas4 += notas;
                } else if (notas ==1) {
                    contadorNotas1++;
                } else if (notas <= 0) {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor diferente de 0 entre 1.0 y 7.0");
                    main(args);
                    System.exit(0);
                }
                sumaNotasTotal+=notas;
            }

            if (contadorNotas5 == 0)promNotas5=0;
            else promNotas5=sumaNotas5/contadorNotas5;

            if (contadorNotas4 == 0)promNotas4=0;
            else promNotas4=sumaNotas4/contadorNotas4;

            promNotasTotaL=sumaNotasTotal/20;

            JOptionPane.showMessageDialog(null,"Notas superiores a 5: "+contadorNotas5+" notas \nPromedio de notas superiores a 5: "+promNotas5);
            JOptionPane.showMessageDialog(null,"Notas inferiores a 4: "+contadorNotas4+" notas \nPromedio de notas inferiores a 4: "+promNotas4);
            JOptionPane.showMessageDialog(null,"Notas en 1: "+contadorNotas1);
            JOptionPane.showMessageDialog(null,"Notas totales son: "+20+" notas \nPromedio de notas totales: "+promNotasTotaL);

        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Porfavor solo ingrese datos numericos decimales");
            main(args);
            System.exit(0);
        }
    }
}
