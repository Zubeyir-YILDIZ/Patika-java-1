import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        /*BİLGİLENDİRME

        ->18-20.satırlar sözlü nesnelerinin oluşturulması
        ->31-41.satırlar arasında "addBulkExamNote" ile sözlü ve notların atanması
        ->49-51.satırlar sözlü tanımlama
        ->58-60.satırlar ctor ile yerel değişkenlere atama
        ->73-94.satırlar arasında notların etkileme yüzdeleri ile not hesabı
        ->115.satır Ortalama Hesaplama
        */


        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course sozluM =new Course("Sözlü.M","ONLYSZL","SZL");
        Course sozluF =new Course("Sözlü.F","ONLYSZL","SZL");
        Course sozluK =new Course("Sözlü.K","ONLYSZL","SZL");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya,sozluM,sozluF,sozluK);
        s1.addBulkExamNote(50,20,40,70,68,76);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya,sozluM,sozluF,sozluK);
        s2.addBulkExamNote(100,50,40,80,69,89);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya,sozluM,sozluF,sozluK);
        s3.addBulkExamNote(50,20,40,56,57,90);
        s3.isPass();

    }
}
class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    Course sozluM;
    Course sozluF;
    Course sozluK;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya,Course sozluM,Course sozluF,Course sozluK) {
        this.sozluM=sozluM;
        this.sozluF=sozluF;
        this.sozluK=sozluK;
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya,int sozluM,int sozluF,int sozluK) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = (mat*70)/100;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = (fizik*60)/100;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = (kimya*60)/100;
        }
        if (sozluM >= 0 && sozluM <= 100) {
            this.sozluM.note = (sozluM*30)/100;
        }
        if (sozluF >= 0 && sozluF <= 100) {
            this.sozluF.note = (sozluF*40)/100;
        }
        if (sozluK >= 0 && sozluK <= 100) {
            this.sozluK.note = (sozluK*40)/100;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0|| this.sozluM.note == 0|| this.sozluF.note == 0|| this.sozluK.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note+ this.sozluM.note+this.sozluF.note+this.sozluK.note) / 6;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Sözlüsü : " + this.sozluM.note);
        System.out.println("Sözlüsü : " + this.sozluF.note);
        System.out.println("Sözlüsü : " + this.sozluK.note);
    }

}

class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}

class Teacher {
    String name;
    String mpno;
    String branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

}