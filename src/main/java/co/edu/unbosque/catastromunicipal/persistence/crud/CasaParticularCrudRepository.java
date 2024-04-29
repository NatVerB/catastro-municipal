package co.edu.unbosque.catastromunicipal.persistence.crud;

import co.edu.unbosque.catastromunicipal.persistence.entity.CasaParticular;
import co.edu.unbosque.catastromunicipal.persistence.entity.CasaParticularPK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CasaParticularCrudRepository extends CrudRepository<CasaParticular, CasaParticularPK> {
    public List<CasaParticular> findByCalle(String calle);
    public List<CasaParticular> findByNumero(Integer numero);
    public void deleteByCalle(String calle);
    public void deleteByNumero(Integer numero);
    public void getByCalle(String calle);
    public void getByNumero(Integer numero);
}
