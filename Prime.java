import java.util.Scanner;
import java.lang.Math;
public class Prime{
public static void main(String[] args){
int i;
int j;
int count;
Scanner sc=new Scanner(System.in); 
int n=sc.nextInt();
for(i=2; i<=n; i++){
count=0;
for(j=2; j<=i/2; j++){
if(i%j==0){
count++;
}
}
if(count==0){
System.out.println(i);
System.out.println(Math.cbrt(i));
 }
 }
 
}
}
