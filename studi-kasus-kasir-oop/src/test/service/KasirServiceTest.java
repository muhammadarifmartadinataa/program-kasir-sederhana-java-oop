package test.service;

import entity.Kasir;
import repository.KasirRepository;
import repository.KasirRepositoryImpl;
import service.KasirService;
import service.KasirServiceImpl;

public class KasirServiceTest {
    public static void main(String[] args) {
        testSumNamaBarang();
    }
    public static void testShowNamaBarang(){
        KasirRepositoryImpl kasirRepository = new KasirRepositoryImpl();
        kasirRepository.data[0]= new Kasir("Sabun",10000);
        kasirRepository.data[1]= new Kasir("Sampo",25000);
        kasirRepository.data[2]= new Kasir("Sikat Gigi",15000);
        KasirService kasirService = new KasirServiceImpl(kasirRepository);

        kasirService.showNamaBarang();
    }
    public static void testAddNamaBarang(){
        KasirRepository kasirRepository = new KasirRepositoryImpl();
        KasirService kasirService = new KasirServiceImpl(kasirRepository);


        kasirService.addNamaBarang("Odol",7000);
        kasirService.addNamaBarang("Super Pel",11000);

        kasirService.showNamaBarang();
    }
    public  static void  testRemoveNamaBarang(){
        KasirRepository kasirRepository = new KasirRepositoryImpl();
        KasirService kasirService = new KasirServiceImpl(kasirRepository);

        kasirService.addNamaBarang("Odol",7000);
        kasirService.addNamaBarang("Super Pel",11000);

        kasirService.showNamaBarang();
        kasirService.removeNamaBarang(1);
        kasirService.showNamaBarang();
    }
    public static void testSumNamaBarang(){
        KasirRepository kasirRepository = new KasirRepositoryImpl();
        KasirService kasirService = new KasirServiceImpl(kasirRepository);

        kasirService.addNamaBarang("Odol",7000);
        kasirService.addNamaBarang("Super Pel",11000);
        kasirService.showNamaBarang();
        kasirService.sum(0);



    }
}
