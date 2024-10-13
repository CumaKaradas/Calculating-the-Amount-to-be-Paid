import java.util.Scanner;

public class OdenecekTutarHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kilometre miktarını girin: ");
        double kilometre = scanner.nextDouble();

        double toplamTutar = kilometre * 20; // Her bir KM için 20TL

        System.out.println("Toplam ödenecek tutar: " + toplamTutar + " TL");

        scanner.close();
    }
}
