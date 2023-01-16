import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        String kullaniciAdi="Patika"; String sifre="Java123"; String kontrol; String sifre2;
        String girilenKullaniciAdi,girilenSifre;
        Scanner input=new Scanner(System.in);

        System.out.println("Kullancı Adınız: "); girilenKullaniciAdi= input.nextLine();


        if(girilenKullaniciAdi.equals(kullaniciAdi))
        {
            System.out.println("Şifrenizi Giriniz: "); girilenSifre= input.nextLine();

            if(girilenSifre.equals(sifre))
            {
                System.out.println("Giriş Başarılı");
            }
            else
            {
                System.out.println("Hatalı Şifre \n Şifrenizi değiştirmek için 'Evet' yazın (Çıkmak için bir tuşa basın) ");
                kontrol=input.nextLine().toUpperCase(); //toUpperCase() konu dışı girilen kelimenin harflerini ilgili değişkene büyük harflerle atar
                if(kontrol.equals("EVET"))
                {
                    sifre2=sifre;
                    System.out.println("Lütfen yeni şifrenizi girin: "); sifre=input.nextLine();
                    if(sifre.equals(sifre2))
                        System.out.println("Yeni şifre eskisi ile aynı olamaz");
                    else
                        System.out.println("Şifreniz Değiştirildi ");

                }
            }
        }
        else
            System.out.println("Kullanıcı Adı Hatalı");




    }
}
