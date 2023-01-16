import javax.crypto.spec.PSource;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int sayi;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: "); sayi = girdi.nextInt();
        if(sayi>1)
        {
            if(Asal(sayi, sayi/2) == 1) {
                System.out.println(sayi + " sayısı asaldır ");
            }
            else
                System.out.println(sayi + " sayısı asal değildir ");
        }
        else
        {
            if(sayi==1)
                System.out.println("1 asal değildir başka değer giriniz...");
            else
                System.out.println("Geçersiz değer ");
        }

    }
    static int Asal(int sayi, int sayac)
    {
        if(sayac==1)
            return 1;
        else
        {
            if(sayi % sayac == 0)
                return 0;
            else
                return Asal(sayi, sayac-1);
        }
    }






}
