import java.util.Scanner;
public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer nombre:");
        String nom1= scanner.nextLine();
        System.out.println("Ingrese el segundo nombre:");
        String nom2= scanner.nextLine();
        System.out.println("Ingrese el tercer nombre:");
        String nom3= scanner.nextLine();

        if (!nom1.isBlank() & !nom2.isBlank() & !nom3.isBlank()) {

            String nom1c =nom1.toUpperCase().charAt(1) + "." + nom1.substring(nom1.length() - 2);
            String nom2c = nom2.toUpperCase().charAt(1) + "." + nom2.substring(nom2.length() - 2);
            String nom3c = nom3.toUpperCase().charAt(1) + "." + nom3.substring(nom3.length() - 2);

            System.out.println(nom1c+"_"+nom2c+"_"+nom3c);

        }else{
            System.out.println("¡ERROR! no se admiten datos en blanco");
            main(args);
            System.exit(0);
        }
    }
}
