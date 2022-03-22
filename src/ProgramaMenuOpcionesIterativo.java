import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
public class ProgramaMenuOpcionesIterativo {
    public static void main(String[] args) {
        int indice = 0;
        do {
            Map<String, Integer> opciones = new HashMap<>();
            opciones.put("Actualizar", 1);
            opciones.put("Eliminar", 2);
            opciones.put("Agregar", 3);
            opciones.put("Listar", 4);

            opciones.put("Salir", 5);

            Object[] opArreglo = opciones.keySet().toArray();
            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione un Operación", "Mantenedor de Usuario", JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                indice = opciones.get(opcion.toString());

                String texto=null;
                switch (indice) {
                    case 1 -> texto = "Usuario actualizado correctamente";
                    case 2 -> texto = "Usuario eliminado correctamente";
                    case 3 -> texto = "Usuario agregado correctamente";
                    case 4 -> texto = "Listando al usuario correctamente";
                    case 5 -> texto = "Va a salir del sistema";
                }
                JOptionPane.showMessageDialog(null, texto);
            }
        } while (indice != 5);
        JOptionPane.showMessageDialog(null, "Haz salido con exito!");
    }
}