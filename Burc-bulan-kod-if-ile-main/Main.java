import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int ay,gun;
        Scanner girdi=new Scanner(System.in);

        System.out.println("Doğduğunuz ayı sayı cinsinden tuşlayınız: "); ay=girdi.nextInt();
        System.out.println("Doğduğunuz günü giriniz: ");     gun=girdi.nextInt();

        if(ay>0 && ay<=12)
        {
            if(ay==1 && gun<=31)
            {
                if(gun<=21)
                    System.out.println("Oğlak");
                else
                    System.out.println("Kova");
            }
            else if(ay==1 && gun>31)
                System.out.println("Hatalı gün sayısı! ");
            if(ay==2 && gun<=28)
            {
                if(gun<=19)
                    System.out.println("Kova");
                else
                    System.out.println("Balık");
            }
            else if(ay==2 && gun>28)
                System.out.println("Hatalı gün sayısı! ");
            if(ay==3 && gun<=31)
            {
                if(gun<=20)
                    System.out.println("Balık");
                else
                    System.out.println("Koç");
            }
            else if(ay==3 && gun>31)
                System.out.println("Hatalı gün sayısı! ");
            if(ay==4 && gun<=30)
            {
                if(gun<=20)
                    System.out.println("Koç");
                else
                    System.out.println("Boğa");

            }
            else if(ay==4 && gun>30)
                System.out.println("Hatalı gün sayısı! ");
            if(ay==5 && gun<=31)
            {
                if(gun<=21)
                    System.out.println("Boğa");
                else
                    System.out.println("İkizler");

            }
            else if(ay==5 && gun>31)
                System.out.println("Hatalı gün sayısı! ");
            if(ay==6 && gun<=30)
            {
                if(gun<=22)
                    System.out.println("ikizler");
                else
                    System.out.println("Yengeç");

            }
            else if(ay==6 && gun>30)
                System.out.println("Hatalı gün sayısı! ");
            if(ay==7 && gun<=31)
            {
                if(gun<=22)
                    System.out.println("Yengeç");
                else
                    System.out.println("Aslan");

            }
            else if(ay==7 && gun>31)
                System.out.println("Hatalı gün sayısı! ");
            if(ay==8 && gun<=31)
            {
                if(gun<=22)
                    System.out.println("Aslan");
                else
                    System.out.println("Başak");

            }
            else if(ay==8 && gun>31)
                System.out.println("Hatalı gün sayısı! ");
            if(ay==9 && gun<=30)
            {
                if(gun<=22)
                    System.out.println("Başak");
                else
                    System.out.println("Terazi");

            }
            else if(ay==9 && gun>30)
                System.out.println("Hatalı gün sayısı! ");
            if(ay==10 && gun<=31)
            {
                if(gun<=22)
                    System.out.println("Terazi");
                else
                    System.out.println("Akrep");

            }
            else if(ay==10 && gun>31)
                System.out.println("Hatalı gün sayısı! ");
            if(ay==11 && gun<=30)
            {
                if(gun<=21)
                    System.out.println("Akrep");
                else
                    System.out.println("Yay");

            }
            else if(ay==11 && gun>30)
                System.out.println("Hatalı gün sayısı! ");
            if(ay==12 && gun<=31)
            {
                if(gun<=21)
                    System.out.println("Yay");
                else
                    System.out.println("Oğlak");

            }
            else if(ay==12 && gun>31)
                System.out.println("Hatalı gün sayısı! ");
        }
        else
            System.out.println("Hatalı ay sayısı! ");













    }
}