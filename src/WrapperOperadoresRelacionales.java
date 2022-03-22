public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 =Integer.valueOf(1000);
        Integer num2 = num1;


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("SOn el mismo objeto= " + (num1 == num2)); // true ya que num2 contiene a la misma instancia o mismo objeto

        // ahora si cambiamos num2, pero con el valor de num1

        num2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("SOn el mismo objeto= " + (num1 == num2)); //false ya que no son el mismo objeto asi tengan el mismo valor no son el mismo objeto

        // para comparar el valor de dos objetos se debe usal el metodo .equals()

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("contienen el mismo valor?= " + (num1.equals(num2) ));
        // otra forma de comparar objetos
        System.out.println("contienen el mismo valor?= " + (num1.intValue()==num2.intValue() ));

        // para < >

        boolean condicion = num1>num2;  // se puede como si fuera un primitivo, esto es posible dado de por debajo del codigo java utiliza el auto unboxin de la clase a primitivo





    }
}
