 public class StarPattern
  {

   public static void main(String[] args)
       {
             int r=3, i, j, k;
             int n=1;
                for(i=1; i<=r; i++)
                {
                    for(j=r; j>i; j--)
                      {
                       System.out.print(" ");
                      }
                     for(k=1; k<=(2*i)-1; k++)
                      {
                       System.out.print("*");
                      }
                       System.out.println();
                 }

               while(n<=2)
                 {
                   System.out.print(" ");
                   for(i=1; i<=r; i++)
                      {
                        System.out.print("*");
                      }
                        System.out.println();
                        n++;
                  }
          }
    }

