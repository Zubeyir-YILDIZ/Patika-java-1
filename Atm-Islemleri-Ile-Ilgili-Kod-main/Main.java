import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        String kullaniciAdi,sifre; int hakGiris=3,bakiye=1500,tercihMenu,sayac=0;
        Scanner girdi=new Scanner(System.in);

        while(hakGiris>0)
        {
            System.out.println("Kullanıcı Adı: ");  kullaniciAdi=girdi.nextLine();
            System.out.println("Şifre: ");          sifre=girdi.nextLine();

            if(kullaniciAdi.equals("patika") && sifre.equals("dev123")) {
                System.out.println("Kodluyoruz Bankasına Hoşgeldiniz ");

                do {
                    if(sayac>0)
                        System.out.println("Başka işlemler için: ");

                    System.out.println("1-Para Yatırma \n 2-Para Çekme \n 3-Bakiye Sorgulama \n 4-Çıkış ");
                    System.out.print("numara tuşlayın: ");
                    tercihMenu = girdi.nextInt();
                    sayac++;

                    switch (tercihMenu) {
                        case 1:
                        {
                            System.out.println("Yatırılacak miktarı giriniz: ");
                            bakiye += girdi.nextInt();
                            System.out.println("İşlem gerçekleştirdi ");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Çekilecek miktarı giriniz: ");
                            int miktarCekilen = girdi.nextInt();
                            if (miktarCekilen > bakiye)
                                System.out.println("Yetersiz Bakiye ");
                            else
                            {
                                bakiye -= miktarCekilen;
                                System.out.println("İşlem gerçekleştirdi ");
                            }


                            break;
                        }
                        case 3:
                        {
                            System.out.println("Bakiyeniz: " + bakiye);
                            break;
                        }
                    }
                } while (tercihMenu != 4);
                {
                    System.out.println("İyi günler dileriz ");
                    break;
                }
            }
            else
            {
                hakGiris--;
                System.out.println("Hatalı kullanıcı adı veya şifre,tekrar deneyiniz");
                if(hakGiris<=0)
                {
                    System.out.println("Hesabınız bloke olmuştur banka ile iletişime geçin ");
                }
                else
                    System.out.println("Kalan hakkınız: "+hakGiris);

            }
        }







    }
}