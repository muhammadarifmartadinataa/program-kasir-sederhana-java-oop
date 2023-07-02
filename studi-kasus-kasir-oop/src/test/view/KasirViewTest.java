package test.view;

import repository.KasirRepository;
import repository.KasirRepositoryImpl;
import service.KasirService;
import service.KasirServiceImpl;
import view.KasirView;

public class KasirViewTest {
    public static void main(String[] args) {
        testSumkasir();

    }
    public static void testViewShowKasir(){
        KasirRepository kasirRepository = new KasirRepositoryImpl();
        KasirService kasirService = new KasirServiceImpl(kasirRepository);
        KasirView kasirView = new KasirView(kasirService);

        kasirService.addNamaBarang("Sampo",12000);
        kasirService.addNamaBarang("Sabun",10000);
        kasirService.addNamaBarang("Odol",7000);
        kasirView.showKasir();
    }
    public static void testAddKasir(){
        KasirRepository kasirRepository = new KasirRepositoryImpl();
        KasirService kasirService = new KasirServiceImpl(kasirRepository);
        KasirView kasirView = new KasirView(kasirService);

        kasirView.addNamaBarang();
        kasirService.showNamaBarang();
        kasirView.addNamaBarang();
        kasirService.showNamaBarang();
    }
    public static void testRemoveKasir(){
        KasirRepository kasirRepository = new KasirRepositoryImpl();
        KasirService kasirService = new KasirServiceImpl(kasirRepository);
        KasirView kasirView = new KasirView(kasirService);

        kasirService.addNamaBarang("Sampo",12000);
        kasirService.addNamaBarang("Sabun",10000);
        kasirService.addNamaBarang("Odol",7000);
        kasirService.showNamaBarang();
        kasirView.removeNamaBarang();
        kasirService.showNamaBarang();
    }
    public static void testSumkasir(){
        KasirRepository kasirRepository = new KasirRepositoryImpl();
        KasirService kasirService = new KasirServiceImpl(kasirRepository);
        KasirView kasirView = new KasirView(kasirService);


        kasirService.addNamaBarang("Sampo",12000);
        kasirService.addNamaBarang("Sabun",10000);
        kasirService.addNamaBarang("Odol",7000);
        kasirService.showNamaBarang();
        kasirService.sum(0);
        kasirView.removeNamaBarang();
        kasirService.sum(0);
        kasirService.showNamaBarang();
    }
}
