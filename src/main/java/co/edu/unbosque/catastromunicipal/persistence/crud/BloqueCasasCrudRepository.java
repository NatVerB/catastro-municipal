package co.edu.unbosque.catastromunicipal.persistence.crud;

import co.edu.unbosque.catastromunicipal.persistence.entity.BloqueCasasPK;
import co.edu.unbosque.catastromunicipal.persistence.entity.BloqueCasas;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface BloqueCasasCrudRepository extends CrudRepository<BloqueCasas, BloqueCasasPK> {
    BloqueCasas findById_Numero(Integer numero);
    BloqueCasas findById_Calle(String calle);
    BloqueCasas findById_CalleAndId_Numero(String calle, Integer numero);
    void deleteById_Calle(String calle);
    void deleteById_Numero(Integer calle);
}
