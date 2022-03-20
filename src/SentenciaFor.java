public class SentenciaFor {
    public static void main(String[] args) {
        for (int i =0; i<=15 ; i++){   // declaramos la variable entera i y la validamos segun la condicion expuesta, si es verdadera se mantiene el ciclo del bucle for y a la vez por cada bucle la vamos incrementando 
            System.out.println("i = " + i);  // imprimimos en pantalla cada valor por bucle
        }
        for (int i =14; i>=0 ; i--)   System.out.println("i = " + i);   // tambien podemos ejecutar el for asi cuando solo hay una instruccion en el bucle

        for (int i =0, j = 10; i < j; i++, j--) System.out.println(i + "----------" + j);  // podemos combinar condicionales y variables para definir el bucle


        int m = 0;    // podemos inicializar la variable fuera del for, pero esta ya estaria al alcance del main
        for (;;){    // podemos dejarlo asi y generar la condicion mas adelante mediante un if con un break para salir
            if (m<=5) {

                System.out.println("m = " + m);
                m++;
                continue;
            }

            break;// podemos dejar el incremento al final
        }
        for (int i = 0; i < 30; i++) {
            if (i%2 ==0){



            }

        }

    }
}
