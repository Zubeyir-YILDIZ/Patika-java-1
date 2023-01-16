import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int indeks,temp;
        System.out.println("Kaç elemanlı dizi oluşturmak istiyorsunuz? "); indeks=input.nextInt();
        int[] dizi =new int[indeks];
        for (int i=0;i<dizi.length;i++)
        {
            System.out.println("Bir eleman giriniz: "); dizi[i]=input.nextInt();
        }
        for(int k=0;k<dizi.length;k++)
        {
            for(int j=0;j<dizi.length;j++)
            {
                if(dizi[k]<dizi[j])
                {
                    temp=dizi[k];
                    dizi[k]=dizi[j];
                    dizi[j]=temp;
                }
            }
        }
        System.out.println("Sıralama: "+Arrays.toString(dizi));
    }
}

