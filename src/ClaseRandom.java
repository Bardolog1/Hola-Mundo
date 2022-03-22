import java.util.Random;

public class ClaseRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        int ranInt = rand.nextInt();
        System.out.println("ranInt = " + ranInt);
        double ranDou = rand.nextDouble();
        System.out.println("ranDou = " + ranDou);
        long ranLon=15 + rand.nextLong(25-15);// podem os poner rangos
        System.out.println("ranLon = " + ranLon);

    }

}
