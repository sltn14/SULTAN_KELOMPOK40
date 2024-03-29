import java.util.Scanner;

public class Main {
    static String tulisan = "Selamat datang di Toko Buku Jago!";

    static void greeting(String nama) {
        System.out.println("Hai, " + nama + " selamat berbelanja!");
    }

    static void cetakTulisan() {
        System.out.println(tulisan);
    }

    static void cetakNama(String buku) {
        System.out.print("Saya ingin membeli buku berjudul " + buku);
    }

    static void hargatotal(int jumlah, int harga) {
        int total = jumlah * harga;
        System.out.println("harga totalnya adalah " + total);
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingin Melanjutkan ? (Ya/Tidak) ");
        String r = scan.next();
        if (r.equalsIgnoreCase("tidak")) {
            System.out.println("Terimakasih sudah berbelanja di toko kami!");
            System.exit(0);
        }
    }

    public static void ucapan(String nama) {
        System.out.println("Terimakasih sudah berbelanja di toko kami, " + nama + "!");
    }

    public static void main(String[] args) {
        String choice = "";
        Scanner scan = new Scanner(System.in);

        while (!choice.equalsIgnoreCase("tidak")) {
            greeting("rachel");
            cetakTulisan();
            method objek = new method();
            System.out.println("Pilih Buku : \n1. Vayre\n2. Nayle\n3. Elle");
            System.out.print("Masukkan nomor buku yang ingin dibeli : ");
            int buku = scan.nextInt();
            System.out.println("Anda memilih buku dengan judul : " + objek.judulbuku(buku));

            System.out.print("Masukkan jumlah buku yang ingin dibeli : ");
            int jumlah = scan.nextInt();

            int harga = 0;
            switch (buku) {
                case 1:
                    harga = 50000;
                    break;
                case 2:
                    harga = 60000;
                    break;
                default:
                    harga = 100000;
                    break;
            }

            hargatotal(jumlah, harga);
            System.out.println("Ingin melanjutkan belanja? (Ya/Tidak) ");
            choice = scan.next();
        }
    }
}
