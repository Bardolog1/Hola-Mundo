import java.util.Scanner;
public class EstanqueGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿En cuantos litros está el combustible?");

            try {
                double lit = scanner.nextDouble();
                String mensaje = null;

                if (lit >= 1 && lit <= 20) {
                    mensaje = "Insuficiente";
                } else if (lit >= 21 && lit <= 35) {
                    mensaje = "Suficiente";
                } else if (lit >= 36 && lit <= 40) {
                    mensaje = "Medio Estanque";
                } else if (lit >= 41 && lit <= 60) {
                    mensaje = "Estanque 3/4";
                } else if (lit >= 61 && lit <= 70) {
                    mensaje = "Estanque Casi LLeno";
                } else {
                    System.out.println("Revise el valor correcto en litros del estanque, ya que no se encuentra dentro del rango establecido");
                    main(args);
                    System.exit(0);
                }

                System.out.println("El Estanque de gasolina se encuentra: " + mensaje);

            }catch (Exception e){
            System.out.println("Verifique los datos suministrados, ya que no ingreso un valor numerico correcto");
            main(args);
            System.exit(0);
        }

    }

}
