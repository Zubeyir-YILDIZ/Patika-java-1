import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int girilenDeger1,girilenDeger2,faktN=1,faktR=1,faktNR=1;int sayac=1;
        Scanner input=new Scanner(System.in);
        System.out.println("C(n,r) kombinasyonu için n ve r değerleri girin: ");
        girilenDeger1=input.nextInt(); girilenDeger2=input.nextInt();


        for(;;) //sonsuz döngü
        {
            sayac++;
            if(sayac<=girilenDeger1)
            {
                faktN*=sayac;
            }
            else
                break;
            if(sayac<=girilenDeger2)
            {
                faktR*=sayac;
            }
            if(sayac<=girilenDeger1-girilenDeger2)
            {
                faktNR*=sayac;
            }

        }
        System.out.println("Kombinasyon C(n,r) : "+faktN/(faktR*faktNR));



    }
}