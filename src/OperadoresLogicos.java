public class OperadoresLogicos {
    public static void main(String[] args) {
        
        int i = 3;
        byte j = 3;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;
        
        boolean b1 = i == 3  &&   k>l;  // && es AND aqui las dos condiciones deben ser verdaderas para que aerroje un true en este and solo se comprueba la condicion inicial, de ser falsa no verifica la segunda y arroja un false
        System.out.println("b1 = " + b1);

        boolean b2 = i ==j  || k>l;
        System.out.println("b2 = " + b2);

        boolean b3 = i==j && k>l || m==false; // se evaluan de iz a dere
        System.out.println("b3 = " + b3);

        




     }

}
