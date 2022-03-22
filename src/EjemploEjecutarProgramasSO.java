import java.util.Locale;

public class EjemploEjecutarProgramasSO {

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime(); // instanciamos
        Process proceso;

        try {
            // comparamos el sistema operativo para llamar al proceso a ejecutar de forma correcta adecuado a la estructuraa del OS
            if (System.getProperty("os.name").toLowerCase(Locale.ROOT).contains("windows")) {
                proceso = rt.exec("notepad");

            }else if (System.getProperty("os.name").toLowerCase(Locale.ROOT).contains("mac")) {
                proceso = rt.exec("Textedit");

            } else if (System.getProperty("os.name").toLowerCase(Locale.ROOT).contains("nux")
                    ||  System.getProperty("os.name").toLowerCase(Locale.ROOT).contains("nix")){
                proceso = rt.exec("gedit");

            }else{
                proceso = rt.exec("gedit");
            }

            proceso.waitFor(); // esperamos a que se cierre el notepad


        } catch (Exception e){
            System.err.println(e.getMessage());
            System.exit(1);// error del sistema 1
        }
        System.out.println("Se ha cerrado el editor");
    }
}
