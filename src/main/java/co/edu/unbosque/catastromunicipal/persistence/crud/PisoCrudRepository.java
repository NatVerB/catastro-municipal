package co.edu.unbosque.catastromunicipal.persistence.crud;

import co.edu.unbosque.catastromunicipal.persistence.entity.BloqueCasas;
import co.edu.unbosque.catastromunicipal.persistence.entity.Persona;
import co.edu.unbosque.catastromunicipal.persistence.entity.Piso;
import co.edu.unbosque.catastromunicipal.persistence.entity.PisoPK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PisoCrudRepository extends CrudRepository<Piso, PisoPK> {
    public List<Piso> getById_Numero(Integer id);
    public List<Piso> getById_Calle(String id);
    public List<Piso> getById_Escalera(Character id);
    public List<Piso> getById_Planta(Integer id);
    public List<Piso> getById_Puerta(String id);
    void deleteById_Numero(Integer id);
    void deleteById_Calle(String id);
    void deleteById_Escalera(Character id);
    void deleteById_Planta(Integer id);
    void deleteById_Puerta(String id);

}
