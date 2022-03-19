public class OperadorInstanceOfGenericos {
    public static void main(String[] args) {

        // con instanceof validamos si pertenece a una clase el objeto en cuestion

        Object texto = "creando uno objeto";  // lo instanc8iamos como objeto para poder hacer la validación con otro tipo de objetos
        Number num = 7;    // es un objeto, se puede de forma literal igual que el String, equivale a  Integer num = new Integer(7);
        Number doub = 2.2;
        Object boo = true;

        boolean b1 = false;

        b1 = texto instanceof String;  // miramos si el objeto pertenece a una clase
        System.out.println("texto es del tipo String = " + b1);

        b1 = texto instanceof Object; // miramos si hace parte de la clase Object, si es de esta clase ya que Object es padre de todos los objetos en este caso del objeto String
        System.out.println("texto es del tipo Object = " + b1);

        b1 = texto instanceof Integer;  // miramos si el objeto pertenece a una clase
        System.out.println("texto es del tipo Integer = " + b1);




        b1 = num instanceof Integer;
        System.out.println("Numero es del tipo Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("Numero es del tipo Number = " + b1); // number es la clase padre de integer, short, long

        b1 = num instanceof Object;
        System.out.println("Numero es del tipo Object = " + b1); // es del tipo object
        b1 = num instanceof Long;
        System.out.println("Numero es del tipo Long = " + b1);
        b1 = num instanceof Short;
        System.out.println("Numero es del tipo Short = " + b1);
        b1 = num instanceof Double;
        System.out.println("Numero es del tipo Double = " + b1);
        b1 = num instanceof Float ;
        System.out.println("Numero es del tipo Float = " + b1);





        b1 = doub instanceof Double;
        System.out.println("Numero Double es del tipo Double = " + b1);

        b1 = doub instanceof Number;
        System.out.println("Numero Double es del tipo Number = " + b1);

        b1 = doub instanceof Object;
        System.out.println("Numero Double es del tipo Object = " + b1);
        b1 = num instanceof Long;
        System.out.println("Numero es del tipo Long = " + b1);
        b1 = num instanceof Short;
        System.out.println("Numero es del tipo Short = " + b1);
        b1 = num instanceof Integer;
        System.out.println("Numero es del tipo Integer = " + b1);
        b1 = num instanceof Float ;
        System.out.println("Numero es del tipo Float = " + b1);



        b1 = boo instanceof Boolean;
        System.out.println("Numero booleano es del tipo Boolean = " + b1);
        b1 = boo instanceof Object;
        System.out.println("Numero booleano es del tipo Object = " + b1);
        b1 = boo instanceof Long;
        System.out.println("Numero booleano es del tipo Long = " + b1);
        b1 = boo instanceof Short;
        System.out.println("Numero booleano es del tipo Short = " + b1);
        b1 = boo instanceof Integer;
        System.out.println("Numero booleano es del tipo Integer = " + b1);
        b1 = boo instanceof Float ;
        System.out.println("Numero booleano es del tipo Float = " + b1);


    }


}
