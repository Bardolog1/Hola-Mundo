public class PrecedenciaOperadores {
    public static void main(String[] args) {
        int i = 14;
        int j =8;
        int k = 20;
                                //Prioridad /
        double promedio = i +j + k / 3d;  // la division tiene prioridad
        System.out.println("promedio = " + promedio);

                            //Prioridad  ()
        double promedio2 = (i +j + k) / 3d;  // esta es la forma correcta ya que los parentesis tienen más prioridad sobre la división
        System.out.println("promedio2 = " + promedio2);


                            //prioridad --->  / *
        double promedio3 = i +j + k / 3d * 10;  // en este caso vemos dos operadores de la misma jerarquia  / y *  en este caso se obedece al orden de izq a dere
        System.out.println("promedio3 = " + promedio3);

                    //prioridad --->  ++ -- / *  en este caso primero los pos y pre decrementos o incrementos  cumpliendo el orden izq a der pero si es un posincremento oo pos decremento no se ve reflejado  si no solo hasta la proxima llamada de la variable, pero no en la operación
        double promedio4 = ++i + j-- + k / 3d * 10;  //
        System.out.println("promedio4 = " + promedio4);





    }
}
