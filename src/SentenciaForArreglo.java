import javax.swing.*;
public class SentenciaForArreglo {
    public static void main(String[] args) {
        String [] nombre={"Andres","pedro","pepe","camilo","carlos","mauricio","miguel"};

        int count = nombre.length;
        for (int i = 0; i <count; i++) {
            System.out.println("nombre = "+i+".- " + nombre[i]);
        }

        for (int i = 0; i <count; i++) {  // en este for llamamos los elementos del arreglo nombre pero vamos a escojer cuales no iterar
            if (nombre[i].equalsIgnoreCase("andres")
                    ||nombre[i].equalsIgnoreCase("pepe")){
                continue;// saltamos la iteracion si encuentra estos nombres
            }
            System.out.println("nombre = "+i+".- " + nombre[i]);
        }

        String buscar= JOptionPane.showInputDialog(null,"Ingrese un nombre");
        boolean encontrado =false;
        for (int i = 0; i <count; i++) {  // en este for llamamos los elementos del arreglo nombre pero vamos a escojer cuales no iterar
            if (nombre[i].equalsIgnoreCase(buscar)){
                encontrado =true;
                break;
            }

            if (encontrado) System.out.println("Encontramos el nombre: "+ buscar);
            else JOptionPane.showMessageDialog(null,buscar+" no fue encontrado en el sistema");
        }

    }
}
