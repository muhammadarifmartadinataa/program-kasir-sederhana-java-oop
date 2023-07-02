import repository.KasirRepository;
import repository.KasirRepositoryImpl;
import service.KasirService;
import service.KasirServiceImpl;
import view.KasirView;

public class AplicationKasir {
    public static void main(String[] args) {
        KasirRepository kasirRepository = new KasirRepositoryImpl();
        KasirService kasirService = new KasirServiceImpl(kasirRepository);
        KasirView kasirView = new KasirView(kasirService);


        kasirView.showKasir();



    }
}
