import javax.crypto.spec.PSource;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
       Scanner input=new Scanner(System.in);
       int girilenDeger,toplam=0,depo=0,gecis=1;

        System.out.println("Bir sayı giriniz: "); girilenDeger=input.nextInt();

        for(int i=0;i<girilenDeger;i++)
        {
            System.out.print(toplam+" ");
            toplam=gecis+depo;
            gecis=depo;
            depo=toplam;
        }
    }
}