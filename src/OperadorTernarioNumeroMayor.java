import java.util.Scanner;
public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {
        int max= 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número");
        int num3 = scanner.nextInt();

        max=(num1>num2) ? num1: num2;
        max=(max> num3) ? max : num3;


        System.out.println("Número Uno= "+num1);
        System.out.println("Número Dos= "+num2);
        System.out.println("Número Tres= "+num3);
        System.out.println("Número Mayor= "+max);


    }
}
