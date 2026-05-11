public class Elektronik extends Produk {
    private int garansi;
    private String merek;

    public Elektronik(String nama, double harga, int stok,  int garansi, String merek) {
        super(nama, harga, stok);
        this.merek = merek;
        this.garansi = garansi;
    }

    @Override
    public double hitungTotalBayar(int jumlah){
        return hitungTotaHarga(jumlah)*0.85;
    }

    @Override
    public void tampilInfo(){
        super.tampilInfo();
        System.out.println("Garansi: " + garansi );
        System.out.println("Merek: " + merek);
    }
}
