import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        double patates = 7.50, elma = 5.00, domates = 17.11, biber = 20.95, patlican = 15.00;
        double patatesKg, elmaKg, domatesKg, biberKg, patlicanKg;
        double patatesFiyat, elmaFiyat, domatesFiyat, biberFiyat, patlicanFiyat;

        System.out.println("Patates kaç kilo: ");
        patatesKg = girdi.nextDouble();
        patatesFiyat=patates * patatesKg;

        System.out.println("Elma kaç kilo: ");
        elmaKg = girdi.nextDouble();
        elmaFiyat = elma * elmaKg;

        System.out.println("Domates kaç kilo: ");
        domatesKg = girdi.nextDouble();
        domatesFiyat=domates*domatesKg;

        System.out.println("Biber kaç kilo: ");
        biberKg=girdi.nextDouble();
        biberFiyat=biber*biberKg;

        System.out.println("Patlican kaç kilo: ");
        patlicanKg=girdi.nextDouble();
        patlicanFiyat=patlican*patlicanKg;

        double total = patatesFiyat + elmaFiyat + domatesFiyat + biberFiyat + patlicanFiyat;

        System.out.println("Toplam tutar : " + total + "TL :((");
    }
}