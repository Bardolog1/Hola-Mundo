public class Caracter {

    public static void main(String[] args) {
        char caracter = '@';
        char decimal = 64;
        char caracterUnicode  = '\u0040';
        System.out.println("caracter = "+caracter);
        System.out.println("caracter en decimal = " +decimal);
        System.out.println("Caracter en Unicode \u0040 = "+ caracterUnicode);

        System.out.println("char corresponde en byte= "+Character.BYTES);
        System.out.println("char corresponde en bits "+ Character.SIZE);
        System.out.println("char minimo valor= "+ Character.MIN_VALUE);
        System.out.println("char maximo valor= "+ Character.MAX_VALUE);
    }
}
