public class main {
    public static void main(String[] args) {
        Produk p = new Elektronik("Laptop", 150000, 5,1, "ASUS");
        Produk p2 = new Makanan("Indomie", 10000, 3, "2030");
        Kasir k = new Kasir("sodiqq");

        p.tampilInfo();
        k.transaksi(p, 1);

        
        p2.tampilInfo();
        k.transaksi(p2, 1);
    }
}
