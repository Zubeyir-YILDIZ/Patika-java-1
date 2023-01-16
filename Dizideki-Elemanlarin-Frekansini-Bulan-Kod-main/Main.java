import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        int[] dizi={10,20,20,10,10,20,5,20};
        int enBuyuk=dizi[0];

        for(int z=0;z<dizi.length;z++)
        {
            if(dizi[z]>enBuyuk)
                enBuyuk=dizi[z];
        }

        int[] temp=new int[enBuyuk+1];

        for(int i=0;i<dizi.length;i++)
        {
            if(dizi[i]!=0)
                 temp[dizi[i]]+=1;

        }

        for(int t=0;t<temp.length;t++)
        {

                if(temp[t]!=0 && t!=0)
                    System.out.println(t +" sayısı "+temp[t]+" kere kullanılmıştır ");
        }
    }
}

