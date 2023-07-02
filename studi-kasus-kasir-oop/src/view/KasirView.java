package view;

import service.KasirService;
import util.InputUtil;

public class KasirView {
    private KasirService kasirService;

    public KasirView(KasirService kasirService) {
        this.kasirService = kasirService;
    }

    public void showKasir() {
        while (true) {
            kasirService.showNamaBarang();
            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("3. Total Harga");
            System.out.println("x. Keluar");
            var input = InputUtil.input("Pilih");
            if (input.equals("1")) {
                addNamaBarang();
            } else if (input.equals("2")) {
                removeNamaBarang();

            }else if (input.equals("3")){
                sum();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }

        }
    }

    public void addNamaBarang() {
        System.out.println("MENAMBAH TODOLIST");
        var namaBarang = InputUtil.input("Nama Barang (x Jika Batal)");
        if (namaBarang.equals("x")) {
            // Batal menambahkan barang
        }
        var hargaBarang = InputUtil.inputInteger("Harga (x Jika Batal)");
        if (hargaBarang == null) {
            // Batal menambahkan barang
        } else {
            kasirService.addNamaBarang(namaBarang, hargaBarang);
        }
    }

    public void removeNamaBarang() {
        System.out.println("MENGHAPUS TODOLIST");
        var number = InputUtil.input("Nomor yang dihapus (x Jika Batal)");
        if (number.equals("x")) {
            //batal
        } else {
            kasirService.removeNamaBarang(Integer.valueOf(number));
        }
    }

    public void sum() {
        System.out.println("MENGHITUNG TOTAL HARGA");
        kasirService.sum(0);
        //System.out.println("Total Harga: " + totalHarga);
        //kasirService.sum(0);

    }
}


