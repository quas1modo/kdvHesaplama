import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fiyat, kdvFiyat, kdvTutar;

        System.out.print("Fiyat Giriniz: ");
        fiyat = input.nextDouble();
        boolean sorgu = fiyat >= 1000;
        double kdvOran = sorgu ? 0.08 : 0.18;
        kdvTutar = fiyat * kdvOran;
        kdvFiyat = fiyat + kdvTutar;

        System.out.println("KDV'siz Tutar = " + fiyat);
        System.out.println("KDV Oranı = " + kdvOran);
        System.out.println("KDV'li Tutar = " + kdvFiyat);
    }
}
