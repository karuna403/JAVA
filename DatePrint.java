import java.text.*;
import java.util.Date;
public class DatePrint{
public static void main(String[] args){
Date d=new Date();
Date d1=new Date();
Date d2=new Date();

SimpleDateFormat ft=new SimpleDateFormat(" E MMM/dd/YYYY  w 'at'  hh:mm:ss a zzz");
System.out.println(ft.format(d));
SimpleDateFormat ft1=new SimpleDateFormat(" dd/MM/YYYY-z  W hh:mm:ss");
System.out.println(d1);
System.out.printf(" %1$tA %1$tB %1$td,  %1$tY %1$tH: %1$tM: %1$tS", d2);

}
}

 
