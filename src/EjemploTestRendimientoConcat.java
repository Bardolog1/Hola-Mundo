public class EjemploTestRendimientoConcat {
    public static void main(String[] args) {
        String a ="a";
        String b ="b";
        String c = a;
        StringBuilder sb = new StringBuilder(a); // si es mutable
        long inicio = System.currentTimeMillis();


        for (int i=0; i<10000; i++) {

            //c = c.concat(a).concat(b).concat("\n");// 500 => 24mseg
            //c += a+b+"\n";  // 500 =>170 ms
            sb.append(a).append(b).append("\n");  // 500 0> 4ms es la forma mas rapida de concatenarString builder mutable y su metodo de concatenación

        }
        long fin =System.currentTimeMillis();
        System.out.println(fin-inicio);
        System.out.println(" c= " +c);
        System.out.println("sb = " + sb.toString());



    }


}


