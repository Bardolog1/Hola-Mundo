import javax.swing.*;
public class MultiplicarSS {
    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero entero"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese otro numero entero"));
            int total = 0;

            if (num2 < 0) {
                num2 = -num2;
                for (int i = 0; i < num2; i++) {
                    total += num1;
                }
                total = -total;
                num2=-num2;
            }else{
                for (int i = 0; i < num2; i++) {
                total += num1;
                }
            }

            JOptionPane.showMessageDialog(null, (num1) + " x " + (num2) + " = " + total);
            System.exit(0);

        }catch (Exception e ){

            JOptionPane.showMessageDialog(null, "No es un valor numerico");
            main(args);
            System.exit(0);


        }
    }


}
