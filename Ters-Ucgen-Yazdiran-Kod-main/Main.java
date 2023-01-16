import javax.crypto.spec.PSource;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int girilenDeger;

        System.out.println("Bir sayı giriniz: "); girilenDeger=input.nextInt();

        for(int i=0;i<girilenDeger;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }

            for(int k=1;k<2*(girilenDeger-i);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}