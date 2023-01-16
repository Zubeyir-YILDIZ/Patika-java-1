import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int girilenDeger,toplam=0;boolean anahtar=true;

        do{
            System.out.print("Bir değer girin: "); girilenDeger=input.nextInt();
            anahtar=girilenDeger%2!=0;

            if(girilenDeger%4==0)  // 4 ün katları zaten çifttir % 2 kontrolüne gerek yoktur
                toplam+=girilenDeger;




        }while(anahtar==false);

        System.out.println("Toplam= "+toplam);





    }
}
