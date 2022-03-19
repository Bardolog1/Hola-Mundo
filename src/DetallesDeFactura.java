import java.util.Scanner;
public class DetallesDeFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la factura : ");
        String nomFactura = scanner.nextLine();

        System.out.println("Ingrese el nombre del primer producto:");
        String nomPro1 = scanner.nextLine();

        System.out.println("ingrese el precio del primer producto:");
        String $Pro1 = scanner.nextLine();

        System.out.println("Ingrese el nombre del segundo producto:");
        String nomPro2 = scanner.nextLine();

        System.out.println("Ingrese el precio del segundo producto:");
        String $Pro2 = scanner.nextLine();

        try {

            double  $Pro100=  Double.parseDouble($Pro1);
            double $Pro200 = Double.parseDouble($Pro2);


            double totalBruto = $Pro100+$Pro200;
            double impuesto = (totalBruto*19)/100;
            double total = totalBruto + impuesto;

            String mensaje = "La factura "+nomFactura+"\n"+nomPro1+".........."+$Pro100+"\n"+nomPro2+".........."+$Pro200+"\n"+"Total Bruto....."+totalBruto+"\n"+"Impuestos ........"+impuesto+"\n"+"Total ......."+total;

            System.out.println(mensaje);


        }catch (Exception e) {
            System.out.println("ERROR!! Ha ingresado datos que no son numericos en los precios de los productos, no se puede generar factura");
            main(args);
            System.exit(0);
        }


    }
}
