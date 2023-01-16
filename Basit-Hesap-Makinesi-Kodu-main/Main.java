import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        double sayi1,sayi2;int secim;
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayıyı girin: "); sayi1=input.nextDouble();
        System.out.println("İkinci sayıyı girin: ");  sayi2=input.nextDouble();

        System.out.println("İşlem seçiniz: ");
        System.out.println("1-Toplama \n 2-Çıkartma \n 3-Çarpma \n 4-Bölme "); secim= input.nextInt();

        switch (secim)
        {
            case(1):
                System.out.println("Toplam: "+(sayi1+sayi2));
                break;
            case(2):
                System.out.println("Çıkartma: "+(sayi1-sayi2));
                break;
            case(3):
                System.out.println("Çarpma: "+(sayi1*sayi2));
                break;
            case(4):
                System.out.println("Bölme: "+(sayi1/sayi2));
                break;
            default:
                System.out.println("Hatalı giriş yaptınız! ");



        }

    }
}