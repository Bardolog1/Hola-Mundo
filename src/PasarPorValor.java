public class PasarPorValor {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("iniciamos el metodo main con i= " + i);
        test(i);
        System.out.println("Finaliza el metodo main con i= " + i);  // sigue siendo 10 dado que solo le pasamos al metodo test el valor de i pero lo guarda en sus propios parametros
        // son inmutables los primitivos y sus wrapper por valor o por referencia ya que se convierte en diferentes instancias
    }

    public static void test(int i){   // se crea una nueva instancia de i
        System.out.println("Iniciamos el metodo test con i= " + i);
        i = 35;  // modificamos la variable i pero de esta instancia, no de la instancia original, es inmutable
        System.out.println("Finaliza el metodo test con i= " + i);
    }
}
