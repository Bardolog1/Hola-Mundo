public class PrimitivosJava  {
    public static void main(String[] args) {
        boolean datoLogico =true;
        System.out.println("Dato logico= "+ datoLogico);

        double d = 98765.43e-3d;
        float f = 1.2345e2f;
        System.out.println("d = "+ d);
        System.out.println("f = "+ f);
        datoLogico = d >f;
        System.out.println("Dato Logico = " + datoLogico);
    }
}
