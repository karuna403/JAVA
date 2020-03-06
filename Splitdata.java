public class Splitdata
{
  public static void main(String[] args)
  {
   String str="23,24,35.5";
   String arr[]=str.split(",");
   float sum=0f;
   for( int i=0; i<=arr.length-1; i++){
   float a=Float.parseFloat(arr[i]);
   sum=sum+a;
   }
   System.out.println(sum);
   }
}