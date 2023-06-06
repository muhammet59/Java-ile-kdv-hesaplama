import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double kdvOrani = 18.0;
        double kdvDegeri;
        double toplamDeger;
        int deger;
        Scanner s = new Scanner(System.in);
        System.out.println("Lutfen kdv degerini hesaplamak istediginiz miktari giriniz");
        deger = s.nextInt();
        kdvDegeri = deger * kdvOrani / 100;
        toplamDeger = kdvDegeri+deger;
        System.out.println("Girdiginiz deger= "+deger);
        System.out.println("Kdv orani= "+kdvOrani+"%");
        System.out.println("Kdvnizin tutari= "+kdvDegeri);
        System.out.println("Kdv'li tutar= "+toplamDeger);

    }
}