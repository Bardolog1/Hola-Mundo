import javax.imageio.plugins.tiff.TIFFImageReadParam;

public class AutoboxinInteger {
    public static void main(String[] args) {

        Integer [] enteros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        /* esto es un autoboxin vamos a asignar valores primitivos
        directamente sobre la clase wrapper de los enteros sin usar
         ningun metodo.
        */

        int suma =0;
        int suma1=0;
        int suma2=0;

        for (Integer num:enteros)suma+=num;
        System.out.println("suma de todos los numeros  = " + suma);
        for (Integer num:enteros){
            if (num.intValue() %2 ==0) {
                suma1+=num;
            }
        }
        System.out.println("suma pares = " + suma1);

        for (Integer num:enteros){
            if (num.intValue() %2 !=0) {
                suma2+=num;
            }
        }
        System.out.println("suma inpares = " + suma2);






    }
}
