import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int girilenSayi;
        Scanner input=new Scanner(System.in);

        System.out.println("1'den n'ye kadar 4 ve 5 in kuvvetleri için bir n sayısı girin: ");
        girilenSayi=input.nextInt();

        System.out.print("4 için: ");
        for(int i=1;i<=girilenSayi;i*=4)
        {
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.print("5 için: ");
        for(int j=1;j<=girilenSayi;j*=5)
        {
            System.out.print(j+" ");
        }




    }
}