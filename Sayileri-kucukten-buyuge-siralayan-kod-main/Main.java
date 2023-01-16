import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int sayi1,sayi2,sayi3,depo;
        Scanner input=new Scanner(System.in);

        System.out.print("1.Sayıyı giriniz: ");    sayi1=input.nextInt();
        System.out.print("2.Sayıyı giriniz: ");  sayi2=input.nextInt();
        System.out.print("3.Sayıyı giriniz: ");  sayi3=input.nextInt();

        if(sayi1!=sayi2&&sayi1!=sayi3&&sayi2!=sayi3)
        {
            if(sayi3>sayi2)
            {
                if(sayi2>sayi1)
                {
                    System.out.println(sayi1+"<"+sayi2+"<"+sayi3);
                }
                else
                if(sayi1<sayi3)
                    System.out.println(sayi2+"<"+sayi1+"<"+sayi3);
                else
                    System.out.println(sayi2+"<"+sayi3+"<"+sayi1);
            }
            else
            {
                if(sayi3>sayi1)
                    System.out.println(sayi1+"<"+sayi3+"<"+sayi2);
                else
                {
                    if(sayi1<sayi2)
                        System.out.println(sayi3+"<"+sayi1+"<"+sayi2);
                    else
                        System.out.println(sayi3+"<"+sayi2+"<"+sayi1);
                }

            }


        }
        else
            System.out.println(sayi1+"="+sayi2+"="+sayi3);







    }
}
