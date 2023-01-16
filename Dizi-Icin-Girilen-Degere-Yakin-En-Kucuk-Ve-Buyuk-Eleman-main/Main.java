import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        int[] list = {15,12,788,1,-1,-778,2,0};
        int sayi,yakinMin=0,yakinMax=0,sayac=-1;
        int[] yeniDizi=Arrays.copyOf(list,list.length);
        Scanner input =new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");   sayi=input.nextInt();

        Arrays.sort(yeniDizi);

        for(int i:yeniDizi)
        {
            if(i<sayi)
            {
                sayac++;
                yakinMin=i;
                yakinMax=yeniDizi[sayac+1];
            }
        }
        System.out.println("Dizi : "+Arrays.toString(list));
        System.out.println("Girilen Sayı : "+sayi);
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+yakinMin);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+yakinMax);
    }
}

