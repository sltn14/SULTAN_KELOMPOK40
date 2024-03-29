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
            return "Hello panda";
        } else if (nomor == 2) {
            return "Hello Jerapah";
        } else {
            return "Hello Kangkung";
        }
    }
}


