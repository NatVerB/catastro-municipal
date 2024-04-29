package co.edu.unbosque.catastromunicipal.persistence.crud;

import co.edu.unbosque.catastromunicipal.persistence.entity.Vivienda;
import co.edu.unbosque.catastromunicipal.persistence.entity.ViviendaPK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ViviendaCrudRepository extends CrudRepository<Vivienda, ViviendaPK>{
    public List<Vivienda> findByCalle(String calle);
    public List<Vivienda> findByNumero(Integer calle);
    public void getByCalle(String calle);
    public void getByNumero(Integer numero);
    public void deleteByCalle(String calle);
    public void deleteByNumero(Integer numero);
}
