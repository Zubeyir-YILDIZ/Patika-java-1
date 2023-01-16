import javax.crypto.spec.PSource;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int girilenDeger,enbuyuk=0,enkucuk=0,sayi;boolean anahtar=true;

        System.out.println("Kaç tane sayı gireceksiniz? ");  girilenDeger=input.nextInt();

        for(int i=0;i<girilenDeger;i++)
        {
            System.out.println(i+1 +".sayıyı girin: "); sayi=input.nextInt();

            if(sayi>enbuyuk)
                enbuyuk=sayi;

            if(anahtar)
            {
                enkucuk=enbuyuk;
                anahtar=false;
            }

            if(sayi<enkucuk)
                enkucuk=sayi;
        }
        System.out.println("En büyük= "+enbuyuk+"\n En küçük= "+enkucuk);














    }
}