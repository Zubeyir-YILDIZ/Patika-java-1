import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int girdi;

        System.out.println("Bir değer girin: "); girdi=input.nextInt();

        for(int i=0;i<=girdi;i++) //düz üçgen
        {
            for(int j=1;j<=girdi-i;j++)
            {
                System.out.print(" ");
            }
            for(int y=1;y<=(2*i+1);y++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int a=0;a<=girdi;a++) //ters üçgen
        {
            for(int k=1;k<=a+1;k++)
            {
                System.out.print(" ");

            }
            for(int z=1;z<=(2*girdi-2*a-1);z++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}