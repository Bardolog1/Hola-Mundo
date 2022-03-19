import java.util.Scanner;
public class NumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);

        System.out.println("Ingrese el primer número");
        int num1 =scanner.nextInt();

        System.out.println("Ingrese el segundo número");
        int num2 =scanner.nextInt();

        String may = num1>num2? "Orden de mayor a menor: "+num1+", "+num2 : "Orden de mayor a menor: " + num2 +", "+num1;
        System.out.println(may);
    }
}
