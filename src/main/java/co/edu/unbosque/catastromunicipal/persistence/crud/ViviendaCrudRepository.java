package co.edu.unbosque.catastromunicipal.persistence.crud;

import co.edu.unbosque.catastromunicipal.persistence.entity.Vivienda;
import co.edu.unbosque.catastromunicipal.persistence.entity.ViviendaPK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ViviendaCrudRepository extends CrudRepository<Vivienda, ViviendaPK>{
    public List<Vivienda> findById_Calle(String calle);
    public List<Vivienda> findById_Numero(Integer numero);
    public void getById_Calle(String calle);
    public void getById_Numero(Integer numero);
    public void deleteById_Calle(String calle);
    public void deleteById_Numero(Integer numero);
}
