import javax.crypto.spec.PSource;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
       for(int i=2;i<=100;i++)
       {
           int sayac=0;

           for(int k=1;k<i;k++)
           {
               if(k!=1 && i % k==0)
               {
                   sayac++;
               }
           }
           if(sayac==0)
                System.out.print(i+" ");
       }
    }
}