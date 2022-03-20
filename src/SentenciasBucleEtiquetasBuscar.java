public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "tres tristes tigres tragan trigo en un trigal";

        String palabra = "trigo";
        char letra = 'r';

        int maxPalabra = palabra.length();
        int maxFrase = frase.length();

        int cantidad = 0;
        int cantidad1 = 0;


        for (int i = 0; i < maxFrase; i++) {
            if (frase.charAt(i) != letra) continue;
            cantidad++;
        }
        System.out.println("la letra " + letra + " se encontro " + cantidad + " veces en la frase");


        buscar:
        for (int i = 0; i < maxFrase; i++) {
            int k = i;


            for (int j = 0; j < maxPalabra; j++) {


                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }


            }
            cantidad1++;


        }


        System.out.println("la palabra " + palabra + " se encontro " + cantidad1 + " veces en la frase");
    }
}



