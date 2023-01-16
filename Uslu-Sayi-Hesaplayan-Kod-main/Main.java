import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int ust,sayi,depo=1;
        Scanner input=new Scanner(System.in);

        System.out.println("n^m(n üstü m) için n değeri girin: "); sayi=input.nextInt();
        System.out.println("n^m(n üstü m) için m değeri girin: "); ust=input.nextInt();


        for(int i=1;i<=ust;i++)
        {

            depo*=sayi;

        }
        System.out.println(depo);






    }
}