import java.text.SimpleDateFormat;
import java.util.Date;  
public class Dateformat{
    public static void main(String[] args){
        Date date=new Date();
        SimpleDateFormat ft1=new SimpleDateFormat(" E ");
        String day=ft1.format(date);
        System.out.println(day);
     switch(day.trim())
     {
         case "Sun" : System.out.println("red");
         break;
         case "Mon" : System.out.println("blue");
         break;
         case "Tue" : System.out.println("green");
         break;
         case "Wed" : System.out.println("pink");
         break;
          case "Thu" : System.out.println("ash");
         break;
          case "Fri" : System.out.println("parrotgreen");
         break;
         case "Sat" : System.out.println("white");
         break;
         case "default" : System.out.println("invalid case");
         
               
     }
         
        
        
}
    
}




