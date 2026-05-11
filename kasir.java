public class kasir {
    private String namaKasir;
    public kasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }

    public void transaksi(Produk p, int jumlah){
        double hargaAkhir = 0.0;
        if (jumlah > p.getStok()) {
            System.out.println("Stok tidak cukup" );
        }else {
            hargaAkhir = p.hitungTotalBayar(jumlah);
            p.setStok(jumlah);
        }

        System.out.println("=====SINAR ABADI=====");
        System.out.println("Kasir: " + namaKasir);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total Harga: " + hargaAkhir);
        System.out.println("sisa stok:" + p.getStok());
    }
}
