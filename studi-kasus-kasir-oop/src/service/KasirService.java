package service;

public interface KasirService {
    void showNamaBarang();
    void addNamaBarang(String namaBarang,Integer harga);
    void  removeNamaBarang(Integer number);
    int sum(Integer totalHarga);

}
