import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        double PI=3.14;double alanDaireDilimi;int yaricap;double merkezAciOlcusu;
        Scanner input=new Scanner(System.in);

        System.out.println("Yarıçapı giriniz: "); yaricap=input.nextInt();
        System.out.println("Merkez açı ölçüsü giriniz: "); merkezAciOlcusu=input.nextDouble();

        alanDaireDilimi =(PI*(yaricap*yaricap)*merkezAciOlcusu)/360;

        System.out.println("Daire diliminin alanı: "+alanDaireDilimi);


    }
}