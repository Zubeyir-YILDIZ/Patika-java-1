import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int mat,fizik,kimya,turkce,muzik,sayac=0; double ortalama=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuz: ");    mat=input.nextInt();
        System.out.println("Fizik Notunuz: ");        fizik=input.nextInt();
        System.out.println("Kimya Notunuz: ");        kimya=input.nextInt();
        System.out.println("Türkçe Notunuz: ");       turkce=input.nextInt();
        System.out.println("Müzik Notunuz: ");        muzik=input.nextInt();

        if(mat!=0 &&mat!=100)
        {
            ortalama += mat;
            sayac++;
        }
        if(fizik!=0 && fizik!=100)
        {
            ortalama += fizik;
            sayac++;
        }
        if(turkce!=0 && turkce!=100)
        {
            ortalama += turkce;
            sayac++;
        }
        if(muzik!=0 && muzik!=100)
        {
            ortalama += muzik;
            sayac++;
        }
        if(kimya!=0 && kimya!=100)
        {
            ortalama += kimya;
            sayac++;
        }
        ortalama /= sayac;

        if(ortalama>=55)
        {
            System.out.println("Tebrikler sınıfı geçtiniz ");
        }
        else
        {
            System.out.println("Üzgünüz sınıfta kaldınız ");
        }
        System.out.println("Ortalamanız: "+ortalama);







    }
}