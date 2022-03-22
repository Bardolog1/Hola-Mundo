public class PasarPorReferencia {
    public static void main(String[] args) {


        /*
        En este ejemplo veremos que son mutables
        por referencia los array a diferencia a
        los datos por valor y los wrapper
        * */
        int[] edad = {10,11,12};
        System.out.println("iniciamos el metodo main con i= ");
        for (int edadfor:edad) System.out.println("edad Antes del test = " + edadfor);
        System.out.println("Antes de llamar al metodo test");
        test(edad);
        System.out.println("Despues de llamar al metodo test");
        for (int edadfor:edad) System.out.println("edad despues de test = " + edadfor);
        System.out.println("Finaliza el metodo main con los datos del arreglo modificados ");

    }

    public static void test(int[] edadArreglo){   // se crea una nueva instancia de i
        System.out.println("Iniciamos el metodo test ");
        for (int i =0; i<edadArreglo.length;i++) {

            edadArreglo[i] = edadArreglo[i]+20;
        }
        System.out.println("Finaliza el metodo test  ");
    }
}
