public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 =1;
        num2 =2;

            // formas de instanciar la clase Boolean y un primitivo boolean

        boolean primitivoBoolean = num1>num2;
        Boolean objetoBoolean=  Boolean.valueOf(primitivoBoolean);
        Boolean objetoBoolean1 = Boolean.valueOf("false");

        System.out.println("primitivoBoolean = " + primitivoBoolean);
        System.out.println("objetoBoolean = " + objetoBoolean);
        System.out.println("objetoBoolean1 = " + objetoBoolean1);


        System.out.println("(objetoBoolean==objetoBoolean1) = " + (objetoBoolean==objetoBoolean1)); // compara el valor contenido sin importar la forma de instanciarlo o de si son el mismo o no objeto
        System.out.println("objetoBoolean1.equals(objetoBoolean) = " + objetoBoolean1.equals(objetoBoolean));


       boolean primitivoBoolean2 = objetoBoolean.booleanValue(); // de objeto a primitivo



    }
}
