import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int mat, turkce, muzik, fizik, kimya;

        System.out.println("Matematik ders notunuz:");
        mat = input.nextInt();
        if (mat<0 || mat>100){
            System.out.println("matematik notunuz geçersiz");
            mat=0;
        }
        System.out.println("Türkçe ders notunuz:");
        turkce = input.nextInt();
        if (turkce<0 || turkce>100){
            System.out.println("türkçe notunuz geçersiz");
            turkce=0;
        }
        System.out.println("Müzik ders notunuz:");
        muzik = input.nextInt();
        if (muzik<0 || muzik>100){
            System.out.println("müzik notunuz geçersiz");
            muzik=0;
        }
        System.out.println("Fizik ders notunuz:");
        fizik = input.nextInt();
        if (fizik<0 || fizik>100){
            System.out.println("fizik notunuz geçersiz");
            fizik=0;
        }
        System.out.println("Kimya ders notunuz:");
        kimya = input.nextInt();
        if (kimya<0 || kimya>100){
            System.out.println("kimya notunuz geçersiz");
            kimya=0;
        }


        double ort = (mat + turkce + muzik + fizik + kimya) / 5;

        if (ort <= 55) {
            System.out.println("Sınıfta kaldınız." + ort);
        }
        else {
            System.out.println("Sınıfı Geçtiniz!" + ort);
        }
    }
}
