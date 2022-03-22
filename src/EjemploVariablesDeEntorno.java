import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv =System.getenv();
        System.out.println("Variables de entorno del sistema = " + varEnv);



       String varEnv2 =System.getenv("USERNAME");
       System.out.println("Variables USERNAME = " + varEnv2);



        String varEnv3 =System.getenv("JAVA_HOME");
        System.out.println("Variables JAVA_HOME = " + varEnv3);

        String varEnv34 =System.getenv("PATH");
        System.out.println("Variables PATH = " + varEnv34);
        String varEnv4 =System.getenv("APPLICATION_ENV");
        System.out.println("Variables PATH = " + varEnv4);


        for(String key :varEnv.keySet()) System.out.println(key+"="+varEnv.get(key));

    }
}
