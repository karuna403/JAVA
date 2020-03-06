 class FibonocciSeries extends Thread{
 FibonocciSeries(){

}
public void run()
{
int a=0;
int b=1;
int n=7;
int c;

System.out.println(a+"\n"+b);

for(int i=1; i<=n; i++)
{
c=a+b;

System.out.println(c);
a=b;
b=c;

}
}
}
public class Threaddemo
{
public static void main(String[] args)
{
FibonocciSeries fb=new FibonocciSeries();
fb.run();
 }
}

