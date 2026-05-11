public class main {
    public static void main(String[] args) {
        Produk p = new Elektronik("Laptop", 15000000, 5, "2023-12-31");
        Produk p2 = new Makanan("Indomie", 10000, 3, 2030);
        Kasir k = new Kasir()

        p.tampilInfo();
        k.transaksi(p, 1);

        
        p2.tampilInfo();
        k.transaksi(p, 1);
    }
}
