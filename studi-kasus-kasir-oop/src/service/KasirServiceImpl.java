package service;
import entity.Kasir;
import repository.KasirRepository;

public class KasirServiceImpl implements KasirService {
    private KasirRepository kasirRepository;
    public KasirServiceImpl(KasirRepository kasirRepository) {
        this.kasirRepository = kasirRepository;
    }
    @Override
    public void showNamaBarang() {
        Kasir[] model = kasirRepository.getAll();
        System.out.println("KASIR SEDERHANA BY MUHAMMAD ARIF MARTADINATA");
        for (var i=0;i < model.length;i++){
            var todo =model[i];
            var no = i+1;
            if (todo !=null){
                System.out.println(no + ". " + todo.getNamaBarang() + " " + todo.getHarga());

            }
        }
    }
    @Override
    public void addNamaBarang(String namaBarang,Integer harga) {
        Kasir kasir = new Kasir(namaBarang,harga);
        kasirRepository.add(kasir);
        System.out.println("SUKSES MENAMBAHKAN ");
        System.out.println("NAMA BARANG : " + kasir.getNamaBarang());
        System.out.println("HARGA BARANG : " + kasir.getHarga());

    }
    @Override
    public void removeNamaBarang(Integer number) {
        boolean succes = kasirRepository.remove(number);
        if (succes){
            System.out.println("SUKSES MENGHAPUS NAMA BARANG & HARGA "+ number);
        }else {
            System.out.println("GAGAL MENGHAPUS NAMA BARANG " + number);
        }
    }
    @Override
    public int sum(Integer totalHarga) {
        kasirRepository.sum(totalHarga);
       // System.out.println("Total Harga " + totalHarga);


        return 0;
    }
}
