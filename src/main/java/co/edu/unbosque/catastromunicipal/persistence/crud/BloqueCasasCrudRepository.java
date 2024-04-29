package co.edu.unbosque.catastromunicipal.persistence.crud;

import co.edu.unbosque.catastromunicipal.persistence.entity.BloqueCasasPK;
import co.edu.unbosque.catastromunicipal.persistence.entity.BloqueCasas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface BloqueCasasCrudRepository extends CrudRepository<BloqueCasas, BloqueCasasPK> {
    public List<BloqueCasas> findByCalleVivienda(String calleVivienda);
    public List<BloqueCasas> findByNumVivienda(Integer numVivienda);
    public void getByCalleVivienda(String calleVivienda);
    public void getByNumVivienda(Integer numVivienda);
    public void deleteByCalleVivienda(String calleVivienda);
    public void deleteByNumVivienda(Integer numVivienda);
}
