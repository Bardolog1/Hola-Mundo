public class ArgumentosLineaComando {
    public static void main(String[] args) {


        if (args.length == 0) {
            System.exit(-1); // -1 erro 1 exception 0 sin fallos
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argumentos n = " + i + " :" + args[i]);

            }
        }
    }
}