import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
       int girdi; double KDV=0.18,kdvMiktarı,kdvliMiktar;
       Scanner input=new Scanner(System.in);

        System.out.print("Miktar giriniz: "); girdi=input.nextInt();
        double durum=(girdi>1000)? 0.08 : 0.18;
        kdvMiktarı=girdi*durum;
        kdvliMiktar=girdi+kdvMiktarı;



        System.out.println("Kdv ile miktar: "+kdvliMiktar+"Kdv miktarı: "+kdvMiktarı
                +"Uygulanan kdv oranı: "+durum);



    }
}