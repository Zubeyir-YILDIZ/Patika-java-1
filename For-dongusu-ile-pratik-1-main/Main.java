import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int girilenDeger,toplam=0,sayac=0;

        System.out.print("Bir değer girin: ");  girilenDeger=input.nextInt();

        for(int i=0;i<girilenDeger;i++)
        {
            if(i%3==0 && i%4==0)
            {
                toplam+=i;
                sayac++;

            }


        }
        System.out.print("3 ve 4 e tam bölünen sayıların ortalaması: "+(toplam/sayac));








    }
}