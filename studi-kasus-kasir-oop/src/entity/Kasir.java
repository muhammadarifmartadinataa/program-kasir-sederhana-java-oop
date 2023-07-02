package entity;

public class Kasir {
    private String namaBarang;
    private Integer harga;

    private Integer totalHarga;

    public Integer getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(Integer totalHarga) {
        this.totalHarga = totalHarga;
    }

    public Kasir(Integer totalHarga) {
        this.totalHarga = totalHarga;
    }

    public Kasir(String namaBarang, Integer harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }
    public Kasir() {

    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }
}
