import javax.crypto.spec.PSource;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int girilenDeger,toplam=0;

        System.out.println("Bir sayı giriniz: "); girilenDeger=input.nextInt();

        for(int i=1;i<girilenDeger;i++)
        {
            if(girilenDeger%i==0)
            {
                toplam+=i;
            }
        }
        if(girilenDeger==toplam)
            System.out.println(girilenDeger+" sayısı mükemmel sayıdır ");
        else
            System.out.println(girilenDeger+" sayısı mükemmel sayı değildir ");
    }
}