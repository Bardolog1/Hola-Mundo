public class ClaseMath {

    public static void main(String[] args) {
        /*
        * la clase math no se puede instanciar y solo tiene metodos estaticos
        *
        *
        *
        * */








        int absoluto = Math.abs(-3);  // los absolutos refiere a su valor sin ser positivo o negativo
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);  // los absolutos refiere a su valor sin ser positivo o negativo
        System.out.println("absoluto = " + absoluto);

        double max=Math.max(3.5,1.2);
        System.out.println("Maximo ="+max);

        double min=Math.min(3.5,1.2);
        System.out.println("Minimo ="+min);

        double redondearTecho = Math.ceil(3.5); // redondea haciaarriba
        System.out.println("redondearTecho = " + redondearTecho);

        double redondearPiso =Math.floor(3.5); // redondeamos hacia abajo
        System.out.println("redondearPiso = " + redondearPiso);

        long redondear = Math.round(3.5); // redondear al mas proximal
        System.out.println("redondear = " + redondear);

        long redondearPI = Math.round(Math.PI);
        System.out.println("redondearPI = " + redondearPI);
        
        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        double exp1 = Math.exp(2);
        System.out.println("exp^2 = " + exp1);

        double loga = Math.log(10);
        System.out.println("Logaritmo 10="+loga);

        double potencia = Math.pow(10,3);
        System.out.println("potencia 10^3 = " + potencia);

        double raiz = Math.sqrt(5); // Raiz cuadrada
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("convertir de radianes a grados = " + grados+" grados");

        double radianes = Math.toRadians(90.0);
        System.out.println("convertir de grados a radianes = " + radianes+" radianes");

        System.out.println("sin(90)= " + Math.sin(radianes)); // el metodo sin para obtener el seno solo recibe como parametro radianes
        System.out.println("cos(90)= " + Math.cos(radianes)); // el metodo cos para obtener el coseno solo recibe como parametro radianes

        radianes = Math.toRadians(180);
        System.out.println("cos(180)= " + Math.cos(radianes));

        radianes = Math.toRadians(0);
        System.out.println("cos(0)= " + Math.cos(radianes));






















    }






}
