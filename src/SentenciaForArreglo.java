public class SentenciaForArreglo {
    public static void main(String[] args) {
        String [] nombre={"Andres","predro","pepe","camilo","carlos","mauricio","miguel"};

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

    }
}
