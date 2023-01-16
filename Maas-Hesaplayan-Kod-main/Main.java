import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Employee e1=new Employee("kemal",2000,45,1985);
        e1.toString();
    }
}
class Employee
{
    int VALUE=30;
    int VALUE2=2021;
    String name;
    double salary;
    int workHours;
    int hireYear;
    Employee(String name,double salary,int workHours,int hireYear)
    {
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    public double tax()
    {
        if(salary>=1000)
        {
            return (salary*3)/100;
        }
        return 0.0;
    }
    public int bonus()
    {
        if(workHours>40)
        {
            return (workHours-40)*VALUE;

        }
        return 0;
    }
    public double raiseSalary()
    {
        if(VALUE2-hireYear>9)
        {
            if(VALUE2-hireYear<20)
            {
                return (salary*10)/100;
            }
            if(VALUE2-hireYear>19)
            {
                return (salary*15)/100;
            }
        }
        else
            return (salary*5)/100;

        return 0.0;
    }
    public String toString()
    {
        System.out.println("Adı : "+this.name+"\nMaaşı : "+this.salary+"\nÇalışma Saati : "+workHours
                +"\nBaşlangıç Yılı : "+hireYear+"\nVergi : "+tax()+"\nBonus : "+bonus()+"\nMaaş Artışı : "+raiseSalary()
                +"\nVergi ve Bonuslar İle Birlikte Maaş : "+(salary+bonus()-tax())+"\nToplam Maaş : "
                +(salary+bonus()+raiseSalary()-tax()));
        return " ";
    }
}

