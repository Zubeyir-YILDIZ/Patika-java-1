import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int[] sayilar={1,2,3,4,5};
        double harmonikSeri=0;
        int elemanSayisi=sayilar.length;
        for(double i=1;i<=elemanSayisi;i++)
        {
            harmonikSeri+=(1/i);
        }
        double harmonikOrt=elemanSayisi/harmonikSeri;
        System.out.println(harmonikOrt);



    }
}

