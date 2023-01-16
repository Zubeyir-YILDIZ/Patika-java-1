import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int deger; double toplam=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: "); deger=input.nextInt();

        for(double n=1;n<=deger;n++)
        {
            toplam+=(1/n);
        }
        System.out.println("Toplam: "+toplam);
    }
}