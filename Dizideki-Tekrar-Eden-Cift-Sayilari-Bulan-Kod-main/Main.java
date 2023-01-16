import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        int[] dizi ={2,3,41,1,5,6,4,2,3,45,65,33,44,44,2,4,7,8,8};
        int[] ElemanTekrarli=new int[dizi.length];
        int sayac=0;

        for(int i=0;i<dizi.length;i++)
        {
            for(int j=0;j<dizi.length;j++)
            {
                if((i!=j) && dizi[i]==dizi[j])
                {
                    if(dizi[i]%2==0)
                    {
                        if(dondur(ElemanTekrarli,dizi[i])!=1)
                            ElemanTekrarli[sayac]=dizi[i];
                    }
                }
            }
            sayac++;
        }
        for(int x:ElemanTekrarli)
            if(x!=0)
                System.out.println(x);

    }
    static int dondur(int[]dizi,int deger)
    {
        for(int x:dizi)
        {
            if(x==deger)
            {
                return 1;
            }
        }
        return 0;
    }

}

