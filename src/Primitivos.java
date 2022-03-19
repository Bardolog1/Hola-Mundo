public class Primitivos {
    public static void main(String[] args) {


        byte numeroByte = 127;
        System.out.println("numeroByte="+numeroByte);
        System.out.println("tipo byte corresponde en byte a "+ Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a "+ Byte.SIZE);
        System.out.println("el valor maximo de un byte es: "+Byte.MAX_VALUE);
        System.out.println("el valor minimo de un byte es:" + Byte.MIN_VALUE);

        short numeroShort = 30000;
        System.out.println("numeroShort="+numeroShort);
        System.out.println("tipo short corresponde en byte a "+ Short.BYTES);
        System.out.println("tipo short corresponde en bites a "+ Short.SIZE);
        System.out.println("el valor maximo de un short es: "+ Short.MAX_VALUE);
        System.out.println("el valor minimo de un short es:" + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt="+numeroInt);
        System.out.println("tipo int corresponde en byte a "+ Integer.BYTES);
        System.out.println("tipo int corresponde en bites a "+ Integer.SIZE);
        System.out.println("el valor maximo de un int es: "+ Integer.MAX_VALUE);
        System.out.println("el valor minimo de un int es:" + Integer.MIN_VALUE);

        long  numeroLong = 9223372036854775807L;     // en los datos long se debe indicar el literal L en mayuscula  al final para no arrojar error
        System.out.println("numeroLong="+numeroLong);
        System.out.println("tipo long corresponde en byte a "+ Long.BYTES);
        System.out.println("tipo long corresponde en bites a "+ Long.SIZE);
        System.out.println("el valor maximo de un long es: "+ Long.MAX_VALUE);
        System.out.println("el valor minimo de un long es:" + Long.MIN_VALUE);

        float numeroFloat = 3.1416f;
        System.out.println("numeroFloat="+numeroFloat);
        System.out.println("tipo float corresponde en byte a "+ Float.BYTES);
        System.out.println("tipo float corresponde en bites a "+ Float.SIZE);
        System.out.println("el valor maximo de un float es: "+ Float.MAX_VALUE);
        System.out.println("el valor minimo de un float es:" + Float.MIN_VALUE);

        double numeroDouble = 3.1416134613476d;
        System.out.println("numeroDouble="+numeroDouble);
        System.out.println("tipo double corresponde en byte a "+ Double.BYTES);
        System.out.println("tipo double corresponde en bites a "+ Double.SIZE);
        System.out.println("el valor maximo de un double es: "+ Double.MAX_VALUE);
        System.out.println("el valor minimo de un double es:" + Double.MIN_VALUE);



        var numeroVar = 127;    //con el tipo de datos var los numeros siempre van a estar asignados al tipo de dato int a ecepeción del Long
    }
}
