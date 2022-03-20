public class SentenciaDoWhile {
    public static void main(String[] args) {
        boolean prueba = true;
        int i =0;

        do {  // posprueba
            if (i==10)prueba=false;
            System.out.println("prueba = " + i);  // ejecutamos antes de validar la condicion
            i++;
        }while(prueba);

    }
}
