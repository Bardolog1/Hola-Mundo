public class SentenciaFor {
    public static void main(String[] args) {
        for (int i =0; i<=15 ; i++){   // declaramos la variable entera i y la validamos segun la condicion expuesta, si es verdadera se mantiene el ciclo del bucle for y a la vez por cada bucle la vamos incrementando 
            System.out.println("i = " + i);  // imprimimosen pantalla cada valor por bucle
        }
        for (int i =14; i>=0 ; i--)   System.out.println("i = " + i);   // tambien podemos ejecutar el for asi cuando solo hay una instruccion en el bucle



        int i = 0;    // podemos inicializar la variable fuera del for, pero esta ya estaria al alcance del main
        for (;;){    // podemos dejarlo asi y generar la condicion mas adelante mediante un if con un break para salir
            if (i<=5) {

                break;
            }
            System.out.println("i = " + i);
            i++; // podemos dejar el incremento al final
        }

    }
}
