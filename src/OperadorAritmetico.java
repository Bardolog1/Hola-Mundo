public class OperadorAritmetico {
    public static void main(String[] args) {
        int i  = 5, j = 4, suma = i+j;
        System.out.println("suma = " + suma);
        int resta = i-j;
        System.out.println("resta = " + resta);
        int multi = i*j;
        System.out.println("multi = " + multi);
        int div1 = i/j;
        System.out.println("div1 = " + div1);
        double div = (float)i/j;  // no arroja decimales, debe ser variable doube tanto como  la que se debe asignar como las operando los cuales se convierten forzadamente con el (float)
        System.out.println("div = " + div);
        int resto =i%j;
        System.out.println("resto = " + resto);


    }
}
