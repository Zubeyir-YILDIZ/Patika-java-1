import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        double sicaklik;
        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen sıcaklık değeri girin: "); sicaklik=input.nextDouble();

        if(sicaklik<=5)
        {
            System.out.println("Kayak yapabilirsiniz ");
        }
        if (sicaklik>5 && sicaklik<=25)
        {
            if(sicaklik<=15)
            {
                System.out.println("Sinemaya gidebilirsiniz ");
            }
            if(sicaklik>10)
            {
                System.out.println("Pikniğe gidebilirsiniz ");
            }
        }
        if(sicaklik>25)
        {
            System.out.println("Yüzmeye gidebilirsiniz ");
        }


    }
}