package repository;

import entity.Kasir;

public class KasirRepositoryImpl implements KasirRepository {
    public Kasir[] data = new Kasir[1000];
    @Override
    public Kasir[] getAll() {
        return data;
    }
    public boolean isFull(){
        //Cek Apakah model penuh
        var isFull= true;
        for (int i =0;i < data.length; i++){
            if (data[i]==null){
                //model masih ada yang kosong
                isFull = false;
                break;
            }
        }
        return isFull;
    }
    public  void resizeIfFull(){
        //Jika penuh, kita resize ukuran 2x lipat
        if (isFull()){
            var temp = data;
            data = new Kasir[data.length * 2];
            for (int i =0; i < temp.length;i++){
                data[i]=temp[i];
            }
        }
    }

    @Override
    public void add(Kasir kasir) {
        //Tambahkan ke posisi yang data arraynya null
        for (var i = 0;i < data.length; i++){
            if (data[i]==null){
                data[i]= kasir;
                break;
            }
        }

    }

    @Override
    public boolean remove(Integer number) {
        if ((number-1) >= data.length){
            return false;
        } else if (data[number - 1]== null){
            return false;
        } else {
            for (int i = (number - 1); i < data.length ; i++) {
                if ( i == (data.length - 1) ){
                    data[i]=null;
                } else {
                    data[i]= data[i + 1];
                }
            }
            return true;
        }

    }
    @Override
    public void sum(Integer totalHarga ) {
        int jumlahHarga = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                jumlahHarga += data[i].getHarga();
            }
        }
        jumlahHarga += totalHarga;
        System.out.println("Total harga semua barang: " + jumlahHarga);



    }
}
