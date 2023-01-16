import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int yilDegeri;

        System.out.print("Yıl Giriniz : "); yilDegeri=input.nextInt();

        if(yilDegeri%100!=0)
        {
            if(yilDegeri%4==0)
                System.out.println(yilDegeri+" bir artık yıldır ");
            else
                System.out.println(yilDegeri+" bir artık yıl değildir ");
        }
        else
        {
            if(yilDegeri%400==0)
                System.out.println(yilDegeri+" bir artık yıldır ");
            else
                System.out.println(yilDegeri+" bir artık yıl değildir ");
        }










    }
}