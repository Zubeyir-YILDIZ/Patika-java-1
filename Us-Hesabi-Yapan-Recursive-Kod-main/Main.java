import javax.crypto.spec.PSource;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int deger1,deger2;
        Scanner input=new Scanner(System.in);
        System.out.println("Taban değeri giriniz:"); deger1=input.nextInt();
        System.out.println("Üst değeri giriniz: ");  deger2=input.nextInt();
        if(deger1>0&&deger2>=0)
            System.out.println(Fonk(deger1,deger2));
        else
            System.out.println("Hatalı giriş...");
    }
    static int Fonk(int taban,int ust)
    {
        int sayi1=taban,sayi2=ust;
        if(sayi2>0)
        {
            sayi2-=1;
            return sayi1 * Fonk(sayi1,sayi2);
        }
        else
            return 1;
    }


}