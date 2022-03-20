public class SentenciasBucleEtiquetas {

    public static void main(String[] args) {
        /* las etiquetas las usamos para identificar un
        * bucle en especifico y al momento de ejecutar un break
        * o un continue podamos indicar a cual estamos dando esta instruccion
        * */

        bucle1:     // asignamos un nombre que es la etiqueta, esta debe estar junto al ciclo al cual asignamos el nombre seguido de los dos puntos, puede estar encima o debajo de la llamada del ciclo
        for (int i = 0; i <5 ; i++) {

            if (i == 2) {
                continue bucle1;  // aqui le indicamos que salte la iteracion al ciclo llamado bucle 1
            }
            System.out.println("i = " + i);


        }
    }
}
