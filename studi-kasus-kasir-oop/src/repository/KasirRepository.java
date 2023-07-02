package repository;

import entity.Kasir;

public interface KasirRepository {
    Kasir[] getAll();

    void add(Kasir kasir);

    boolean  remove(Integer number);

    void sum(Integer totalHarga);


}
