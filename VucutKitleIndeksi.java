package TemelKavramlarveDegiskenler;

import java.util.Scanner;

public class VucutKitleIndeksi {
    /*
    Vücut Kitle İndeksi Hesaplama
    Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

    Formül
    Kilo (kg) / Boy(m) * Boy(m)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu giriniz : ");
        int kilo = input.nextInt();

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = input.nextDouble();

        double indeks = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz : " + indeks);
    }
}
