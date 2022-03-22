import java.text.SimpleDateFormat;
import java.util.Date;
// importamos el paquete Date para poder usarlo en esta clase

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date(); // instanciamos un nuevo objeto de la clase Date
        System.out.println("fecha = " + fecha); // vemos la fecha actual

        SimpleDateFormat formato = new SimpleDateFormat("dd-MMMM-yyyy"); // instanciamos un nuevo objeto de la clase SimpleDateFormat para poder dar formato  a la fecha devuelta por el objeto fecha
        // en la llamada de la clase de la linea anterior le
        // pasamos como argumento el formato que vamos a necesitar
        // para la fecha, dd (minuscula para dia)
        // MM (Mayuscula mes en número) o MMMM ( en mayuscula para el mes en nombre)
        //yyyy ( en minuscula para el año completo)
        // podemos agregar guiones, comas o slash para separar
        // tambien podemos agragar texto personalizado pero debe ir d
        // entro de comillas simples


        String fechaStr = formato.format(fecha);
        // le pasamos a la clase de la linea 11
        // el objeto fecha creado en la linea 8
        // y lo guardamos en la cadena declarada en la linea 22



        // uso del .getTime


        long j=0;
        for (int i =0; i< 10000000; i++){
            j+=i;
        }
        System.out.println("j = " + j);
        Date fecha2 =new Date();
        long finalTiempo =fecha2.getTime()- fecha.getTime();  // obtenemos el tiempo desde enero de1970 en los dos metodos fecha y fecha2 y los restamos para saber cuanto tiempo pasó en el for
        System.out.println("Tiempo transcurrido en el for= " + finalTiempo+" ms");
        System.out.println("fechaStr = " + fechaStr);
        // .getTime() lo usamos para obtener
        // el tiempo actual transcurrido desde
        // enero de 1970 y lo podemos usar para
        // calcular tiempos transcurridos de
        // una ejecucion instanciando dos veces
        // el metodo uno antes del proceso y
        // otro luego y luego restandolos

    }
}


// letras indicativas para formato de fecha de la clase SimpleDateFormat

/*
Letter            Date or Time Component                                Presentation                                 Examples


G	                Era designator	                                        Text	                                    AD
y	                Year	                                                Year	                                    1996; 96
Y	                Week year	                                            Year	                                    2009; 09
M	                Month in year (context sensitive)	                    Month	                                    July; Jul; 07
L	                Month in year (standalone form)                         Month   	                                July; Jul; 07
w	                Week in year                               	            Number	                                    27
W	                Week in month	                                        Number	                                    2
D	                Day in year	                                            Number                                 	    189
d	                Day in month	                                        Number	                                    10
F	                Day of week in month	                                Number	                                    2
E	                Day name in week	                                    Text                                   	    Tuesday; Tue
u	                Day number of week (1 = Monday, ..., 7 = Sunday)        Number	                                    1
a	                Am/pm  marker	                                        Text	                                    PM
H	                Hour in day (0-23)	                                    Number	                                    0
k	                Hour in day (1-24)	                                    Number	                                    24
K	                Hour in am/pm (0-11)	                                Number	                                    0
h	                Hour in am/pm (1-12)	                                Number	                                    12
m	                Minute in hour	                                        Number	                                    30
s	                Second in minute	                                    Number	                                    55
S	                Millisecond	                                            Number	                                    978
z	                Time zone	                                            General time zone	                        Pacific Standard Time; PST; GMT-08:00
Z	                Time zone	                                            RFC 822 time zone	                        -0800
X	                Time zone	                                            ISO 8601 time zone	                        -08; -0800; -08:00
*/