import javax.crypto.spec.PSource;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int sayi;
        Scanner input=new Scanner(System.in);
        System.out.println("İki basamaklı bir sayı giriniz: "); sayi=input.nextInt();
        if(sayi>=10)
            palindromMu(sayi);
        else
            System.out.println("Hatalı sayı ");
    }
    public static void palindromMu(int sayi)
    {
        int onlukBasamakS=1;
        int resultBasamakSayisi=basamakSayisi(sayi);
        for(int i=1;i<resultBasamakSayisi;i++)
        {
            onlukBasamakS*=10;
        }
        int yedek=sayi;
        int basamak,sayac=0,toplam=0;
        while(yedek>0)
        {
            if(resultBasamakSayisi>0)
            {
                basamak=yedek%10*onlukBasamakS;
                onlukBasamakS/=10;
                toplam+=basamak;
                yedek/=10;
            }
        }
        if(sayi==toplam)
            System.out.println(sayi+" Bir palindrom sayıdır ");
        else
            System.out.println("Palindrom sayı değildir ");
    }
    public static int basamakSayisi(int sayi)
    {
        int sayac=0;
        while(sayi>0)
        {
            sayi/=10;
            sayac++;
        }
        return sayac;
    }
}