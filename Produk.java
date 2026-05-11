public abstract class Produk {
    private String nama;
    private double harga;
    private int stok;


    public Produk(String nama, double harga, int stok){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public int getStok(){
        return stok;
    }

    public void setStok(int jumlah){
        stok -= jumlah;
    }

    public void tampilInfo(){
        System.out.println("Nama Produk: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }

    public double hitungTotaHarga(int jumlah){
        return harga;

    }

    public abstract double hitungTotalBayar(int jumlah);





}
