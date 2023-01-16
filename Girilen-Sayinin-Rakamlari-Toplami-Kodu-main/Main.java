import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int sayi,depo=0;
        Scanner input=new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");  sayi=input.nextInt();

        while(sayi>0)
        {
            depo+=sayi%10;
            sayi/=10;
        }
        System.out.println("Sayının rakamları toplamı: "+depo);











    }
}