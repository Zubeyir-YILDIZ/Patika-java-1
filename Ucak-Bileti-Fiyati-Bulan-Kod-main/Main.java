import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int yas,sehahatYonu,mesafeKm,anahtar=0; double fiyatBilet,MBU=0.10,ind1,ind2,ind3,ind4;
        boolean k1=false,k2=false,k3=false,k4=false;
        Scanner girdi=new Scanner(System.in);

        System.out.print("Lütfen mesafeyi(Km cinsinden)giriniz: "); mesafeKm=girdi.nextInt();
        System.out.print("Lütfen yaşınızı giriniz: ");              yas=girdi.nextInt();
        System.out.print("Lütfen yolculuk tipi için sayı tuşlayınız:(1=Tek yön)/(2=Gidiş Dönüş) ");
                                                                    sehahatYonu= girdi.nextInt();
        fiyatBilet=mesafeKm*MBU;

        if(sehahatYonu==1||sehahatYonu==2 && mesafeKm>0&&yas>0)
        {
            if (sehahatYonu==2)
            {
                fiyatBilet=2*((fiyatBilet*80)/100);
            }
            if(yas<12)
            {
                fiyatBilet=fiyatBilet/2;
            }
            if (yas>=12&&yas<24)
            {
                fiyatBilet=(fiyatBilet*90)/100;
            }
            if (yas>65)
            {
                fiyatBilet=(fiyatBilet*70)/100;
            }

            System.out.println("Toplam Tutar= "+fiyatBilet);
        }
        else
            System.out.println("Hatalı Veri Girdiniz! ");











    }
}