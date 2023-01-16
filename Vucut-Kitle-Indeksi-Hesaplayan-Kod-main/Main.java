import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        double boy,kilo,vucutKitleEndeksi;
        Scanner input=new Scanner(System.in);

        System.out.println("lütfen boyunuzu(metre cinsinden) giriniz: "); boy=input.nextDouble();
        System.out.println("lütfen kilonuzu giriniz: "); kilo=input.nextDouble();

        vucutKitleEndeksi=kilo/(boy*boy);

        System.out.println("Vücut Kitle Endeksiniz: "+vucutKitleEndeksi);


    }
}