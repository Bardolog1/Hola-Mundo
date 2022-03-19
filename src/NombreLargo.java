import javax.swing.*;

public class NombreLargo {
    public static void main(String[] args) {

        String nom1 = JOptionPane.showInputDialog(null, "Ingrese el primer nombre completo");
        String nom2 = JOptionPane.showInputDialog(null, "Ingrese el segundo nombre completo");
        String nom3 = JOptionPane.showInputDialog(null, "Ingrese el tercer nombre completo");

        String largo = (nom1.split(" ")[0].length() < nom2.split(" ")[0].length()) ? nom2 : nom1;
        largo = (nom3.split(" ")[0].length() < largo.split(" ")[0].length()) ? largo: nom3;

        System.out.println("El nombre más largo es de" + largo);

    }
}
