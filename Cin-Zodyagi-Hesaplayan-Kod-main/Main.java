import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int dogumYili,bolumdenKalan; String girisMetin="Çin Zodyağı Burcunuz : ";

        System.out.print("Doğum yılınızı giriniz: ");
        dogumYili=input.nextInt();

        bolumdenKalan=dogumYili % 12;

        switch (bolumdenKalan)
        {
            case 0:
                System.out.println(girisMetin+"Maymun ");
                break;
            case 1:
                System.out.println(girisMetin+"Horoz ");
                break;
            case 2:
                System.out.println(girisMetin+"Köpek ");
                break;
            case 3:
                System.out.println(girisMetin+"Domuz ");
                break;
            case 4:
                System.out.println(girisMetin+"Fare ");
                break;
            case 5:
                System.out.println(girisMetin+"Öküz ");
                break;
            case 6:
                System.out.println(girisMetin+"Kaplan ");
                break;
            case 7:
                System.out.println(girisMetin+"Tavşan ");
                break;
            case 8:
                System.out.println(girisMetin+"Ejderha ");
                break;
            case 9:
                System.out.println(girisMetin+"Yılan ");
                break;
            case 10:
                System.out.println(girisMetin+"At ");
                break;
            case 11:
                System.out.println(girisMetin+"Koyun ");
                break;
            default:
                break;
        }










    }
}