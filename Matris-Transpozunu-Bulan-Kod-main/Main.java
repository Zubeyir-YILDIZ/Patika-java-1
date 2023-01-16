import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int eksenX,eksenY;
        System.out.println("X satır,Y sütun değerlerini giriniz "); eksenX=input.nextInt(); eksenY= input.nextInt();
        int[][] dizi = new int[eksenX][eksenY];
        System.out.println("Matrisin elemanlarını giriniz ");

        for(int i=0;i<eksenX;i++)
        {
            for(int j=0;j<eksenY;j++)
            {
                dizi[i][j]=input.nextInt();
            }
            System.out.println();
        }
        System.out.print("    Matris\n---------------\n");
        for(int i=0;i<eksenX;i++)
        {
            for(int j=0;j<eksenY;j++)
            {
                System.out.print(dizi[i][j]+"  ");

            }
            System.out.println();
        }
        System.out.print("   Transpozu\n---------------\n");
        for(int i=0;i<eksenY;i++)
        {
            for(int j=0;j<eksenX;j++)
            {
                System.out.print(dizi[j][i]+"  ");
            }
            System.out.println();
        }
    }
}

