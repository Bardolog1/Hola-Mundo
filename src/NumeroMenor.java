import java.util.Scanner;
public class NumeroMenor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a comparar");
        int cantidad = scanner.nextInt();

        if (cantidad < 10)System.out.println("No es valido, son minimo 10 numeros");
        else {
            int men=Integer.MAX_VALUE ;
            int numero;

            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingrese numero:" + (i + 1));
                numero = scanner.nextInt();
                men = (men > numero)?numero:men;
            }

            System.out.println("El numero menor:"+men);

            if (men<10) System.out.println("El numero "+men+" es menor que 10");
            else System.out.println("El numero "+men+" es mayor o igual que 10");
        }


    }
}
