package co.edu.unbosque.catastromunicipal.persistence.crud;

import co.edu.unbosque.catastromunicipal.persistence.entity.CasaParticular;
import co.edu.unbosque.catastromunicipal.persistence.entity.CasaParticularPK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CasaParticularCrudRepository extends CrudRepository<CasaParticular, CasaParticularPK> {
    List<CasaParticular> findById_Calle(String calle);
    List<CasaParticular> findById_Numero(Integer numero);
    void deleteById_Calle(String calle);
    void deleteById_Numero(Integer numero);
    void getById_Calle(String calle);
    void getById_Numero(Integer numero);
}
