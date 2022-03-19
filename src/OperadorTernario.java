import java.util.Scanner;
public class OperadorTernario {
    public static void main(String[] args) {
        // esta conformado por 3 partes, y se usa para validar boleanos
        // puede decirce que es una abreviación del if else, pero se diferencian porque en este debuelve un valor
        // Estructura variable= condición?  si_es verdadero : si_es falso ;



        //Ejercicio Simple

        String variable = 7 ==7 ?  "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);
        String variable1 = 7 ==5 ?  "si es verdadero" : "si es falso";
        System.out.println("variable1 = " + variable);



        //ejercicio de promedio de notas
        Scanner scanner = new Scanner (System.in);
        double promedio =0.0;
        double matema = 0.0;
        double cienc = 0.0;
        double histo=0.0;
        System.out.println("Ingrese la nota de matematicas");
        matema= scanner.nextDouble();
        System.out.println(" Ingrese la nota de Ciencias");
        cienc = scanner.nextDouble();
        System.out.println("Ingrese la nota de istoria");
        histo = scanner.nextDouble();
        promedio = (matema+cienc+histo)/3;
        String estado = "";

        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("Promedio = " + promedio);
        System.out.println("Estado = " + estado);

    }
}
