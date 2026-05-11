public class Makanan extends Produk {
    private String expired;

    public Makanan(String nama, double harga,int stok, String expired) {
        super(nama, harga, stok);
        this.expired = expired;
    }

    @Override
    public double hitungTotalBayar(int jumlah){
        return hitungTotaHarga(jumlah)*0.5;
    }

    @Override
    public void tampilInfo(){
        super.tampilInfo();
        System.out.println("Expired:"+ expired);
    }
}