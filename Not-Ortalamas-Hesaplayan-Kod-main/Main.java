import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
       int mat,fizik,kimya,turkce,tarih,muzik;
       double Ort;
       Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notu: "); mat=input.nextInt();
        System.out.println("Fizik Notu: "); fizik=input.nextInt();
        System.out.println("Kimya Notu: "); kimya=input.nextInt();
        System.out.println("Türkçe Notu: "); turkce=input.nextInt();
        System.out.println("Tarih Notu: ");  tarih=input.nextInt();
        System.out.println("Müzik Notu: ");  muzik=input.nextInt();

        Ort=(mat+fizik+kimya+turkce+tarih+muzik)/6;
        String durum = (Ort >=60) ? "sınıfı geçti " : "sınıfta kaldı " ;

        System.out.println(Ort+" ortalama ile "+durum);


    }
}