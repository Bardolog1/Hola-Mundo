import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
         String texto= "Hola que tal";

         Class strClass = texto.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getName() = " + strClass.getSimpleName());
        System.out.println("strClass.getName() = " + strClass.getPackage());
        System.out.println("strClass.getName() = " + strClass.getPackageName());

        for (Method stClas : strClass.getMethods()){
            System.out.println("stClas.getName() = " + stClas.getName());
        }


        Integer entero =34;
        Class intClass = entero.getClass();

        System.out.println("intClass.getName() = " + intClass.getName());
        System.out.println("intClass.getName() = " + intClass.getSimpleName());
        System.out.println("intClass.getName() = " + intClass.getPackage());
        System.out.println("intClass.getName() = " + intClass.getPackageName());
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass());
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass().getSuperclass());

        for (Method inClas : intClass.getMethods()){
            System.out.println("intClass.getName() = " + inClas.getName());
        }


    }
}
