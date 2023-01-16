import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int sayi,sabitSayi,temp;
        Scanner input=new Scanner(System.in);
        System.out.println("Bir Değer Giriniz: ");  sayi=input.nextInt();
        sabitSayi=sayi;
        temp=sayi;
        fonk(sayi,sabitSayi,temp);
    }
    public static void fonk(int sayi,int sabitSayi,int temp)
    {
        if(sabitSayi>0)
        {
            System.out.print(sayi+" ");
            sayi-=5;
            sabitSayi-=5;
            fonk(sayi,sabitSayi,temp);
        }
        else if(sayi<=temp)
        {
            System.out.print(sayi+" ");
            sayi+=5;
            fonk(sayi,sabitSayi,temp);
        }
    }
}