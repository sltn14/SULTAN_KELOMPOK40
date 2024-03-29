class method {
    public String judul(String judul) {
        return judul;
    }

    void judulbuku() {
        System.out.println("1. " + judulbuku(1));
        System.out.println("2. " + judulbuku(2));
        System.out.println("Untuk memungkinkan pengguna memilih nomor buku, Anda perlu mengubah kode Anda sebagai berikut:");
    }

    String judulbuku(int nomor) {
        if (nomor == 1) {
            return "Vayre";
        } else if (nomor == 2) {
            return "Nayle";
        } else {
            return "Eile";
        }
    }
}


