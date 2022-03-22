public class WrapperInteger {
    public static void main(String[] args) {

        // forma de declarar un entero por medio de la clase wrapper Integer
        int intPrimitivo = 128;
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intPrimitivo;
        int intPrimitivo2 = intObjeto;
        int intPrimitivo3 =intObjeto2.intValue();


        String valorTVLcd ="67000";
        Integer valor = Integer.valueOf(valorTVLcd);
        System.out.println("valor = " + valor);


        // en los proximos dos ejemplos hay que tener cuidado ya que puede haber perdida de datos si el integer supero el limite de datos del short y el byte

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        Byte byteObjeto = intObjeto2.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);





    }
}
