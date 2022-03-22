public class ClaseMathRandom {
    public static void main(String[] args) {
        //el metodo sirve para generar un numero aleatorio entre 0 y 1 pero no es inclusivo el numero 1


        String [] colores = {"rojo","amarillo","verde","azul","violeta","naranja"};
        double random =Math.random();
        System.out.println("random =\n " + random);
        random*=7;
        random =  Math.floor(random);
        System.out.println("random entre 0 y 7=\n " + random);  // numero al azar de 1 a 6



        // ejemplo practico    ---- colores aleatorios
        double randomCol =Math.random();
        randomCol *= colores.length;
        randomCol =  Math.floor(randomCol);
        System.out.println("numero de color=\n " + randomCol);
        System.out.println("colores = " + colores[(int)randomCol]);


    }
}
