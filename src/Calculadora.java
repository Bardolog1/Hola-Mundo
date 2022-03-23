public class Calculadora {
    public static void main(String[] args) {

        if (args.length !=3){
            System.out.println("Porfavor ingresar una " +
                    "operación y dos numeros");
            System.exit(-1);
        }else {
            String operacion = args[0];
            int a = Integer.parseInt(args[1]);
            int b = Integer.parseInt(args[2]);
            double resultado = 0;
            switch (operacion) {
                case "Suma":
                    resultado = a + b;
                    break;
                case "Resta":
                    resultado = a - b;
                    break;
                case "Multiplicación":
                    resultado = (double) a * b;
                    break;
                case "División":
                    if (b == 0) {
                        System.err.println("no se puede dividir por cero!!");
                        System.exit(-1);
                    } else {
                        resultado = (double)a / b;
                        break;
                    }
                default:
                    System.out.println(operacion + " no es una operación valida");
            }

            System.out.println("El resultado de la "+operacion+" es: "+resultado);

        }
    }
}
/*
* para ejecutar buscamos el directorio de
* alojamiento de los archivos .java
* (normalmente es en el src) en consola
* luego lo invocamos anteponiendo "javac"
* más el nombre del archivo y su extension .java
* Luego quedará compilado, después de compilado
* invocamos su bytecode respectivo que tiene
* extension .class, se invoca anteponiendo
* la palabra java y el nombre del archivo sin
* la extensión, seguido podemos pasar los
*  argumentos separados por espacios
* (en caso de ser una frase con espacios o cadena de
* texto debe ir entre comillas dobles) y
* podemos agregar al final el parametro "-encoding utf8"
* para poder ver correctamebte los caracteres
* especiales o con acento
*
* */