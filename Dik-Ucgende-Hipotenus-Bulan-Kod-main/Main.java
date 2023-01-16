import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       int kenar1,kenar2,kenar3; double u,alanKare;

        System.out.println("Birinci kenar uzunluğunu giriniz: "); kenar1=input.nextInt();
        System.out.println("İkinci kenar uzunluğunu giriniz: ");  kenar2=input.nextInt();
        System.out.println("Üçüncü kenar uzunluğunu giriniz: ");  kenar3=input.nextInt();

        u=(kenar1+kenar2+kenar3)/2;
        alanKare=u*(u-kenar1)*(u-kenar2)*(u-kenar3);


        System.out.println("Alan: "+Math.sqrt(alanKare));


    }
}