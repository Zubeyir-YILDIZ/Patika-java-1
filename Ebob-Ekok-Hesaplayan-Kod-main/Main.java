import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        boolean anahtar=true; int deger1,deger2,sayiBolen=1,depo1=0,depo2=0,ebob=0;
        Scanner input=new Scanner(System.in);

        System.out.println("İlk değeri giriniz: "); deger1=input.nextInt();
        System.out.println("İkinci değeri giriniz: "); deger2=input.nextInt();

        while(sayiBolen<=deger1 && sayiBolen<=deger2)
        {
            if(deger1%sayiBolen==0)
            {
                depo1=sayiBolen;
            }
            if(deger2%sayiBolen==0)
            {
                depo2=sayiBolen;
            }
            if(depo1==depo2 && (ebob<=depo1 || ebob<=depo2))
            {
                ebob=depo1;
            }
            sayiBolen++;
        }
        System.out.println("EBOB: "+ebob);
        System.out.println("EKOK: "+(deger1*deger2)/ebob);






    }
}