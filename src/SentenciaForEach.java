public class SentenciaForEach {
    public static void main(String[] args) {

        // solamente para arreglos
        int [] numeros = {1,5,2,5,4,8,3,15,145,15,15,45,85};  //arreglod e numeros
        String [] nombre={"Andres","pedro","pepe","camilo","carlos","mauricio","miguel"};


        // una forma de instanciar simple
        for (int num : numeros) System.out.println("num = " + num);  // se instancia el for comun pero sin una validacion y sin un incremento, solo se declara una variable local a la cual se le asignaran los elementos del arreglo por cada iteracion

        //una forma de instanciar no simple pero de buena practica
        for(String nom:nombre){// recorrer por cada elemento del arreglo
            System.out.println(nom);
        }


    }
}
