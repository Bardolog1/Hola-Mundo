import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
       // Calendar calendario new Calendar();  // es una clase abstracta y no permite instanciar con el operador new
        Calendar calendario = Calendar.getInstance(); // asi invocamos y creamos la instancia de calendario pero se adecua al calendario de la region, en este caso es el gregoriano
        calendario.set(2020,0,25,19,20,10 );   // el mes 0 siempre es enero y aqui personalizamos la fecha a una fecha cualquiera

        Date calenda = calendario.getTime();  // tambien a un objeto Calendar podemos instanciar el metodo getTime() igual que la clase Date
        System.out.println("calendario = " + calenda);



        // tambien podemos personalizar asi, por medio de la constante
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, 7); // meses eimpre empiezan desde 0
        calendario.set(Calendar.DAY_OF_MONTH, 20);

        //calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 30);
        calendario.set(Calendar.MILLISECOND, 425);

        Date fechaa = calendario.getTime();
        System.out.println("calendario sin formato = " + fechaa);
        SimpleDateFormat formato = new SimpleDateFormat("'Fecha: 'dd/MMMM/yyyy 'Hora:' hh:mm:ss:SSS a");
        String fechaGConFormato = formato.format(fechaa);
        System.out.println("fecha con formato  = " + fechaGConFormato);








    }
}
