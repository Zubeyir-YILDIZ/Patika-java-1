import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        String kelime;
        System.out.println("Bir kelime giriniz: "); kelime=input.nextLine();
        String temp="";
        for(int i=kelime.length()-1;i>=0;i--)
        {
            temp+=kelime.charAt(i);

        }
        if(kelime.equals(temp))
            System.out.println("Palindromdur ");
        else
            System.out.println("Palindrom değildir ");
    }
}

