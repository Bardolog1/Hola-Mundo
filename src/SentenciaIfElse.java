public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 5.8f;
        float promedio2 = 7.8f;

        // en la sintaxis correcta sin abreviar, es la forma mas correcta para la buena comprensión del codigo aunque se puede abreviar

        if(promedio > 6.5){
            System.out.println("Exelente promedio");
        }else{
            System.out.println("necesitas esforzarte un poco más");
        }

        // en caso de solo tener una sentencia por bloque podemos abreviar asi:

        if(promedio2 > 6.5)System.out.println("Exelente promedio");
        else System.out.println("necesitas esforzarte un poco más");




    }
}
