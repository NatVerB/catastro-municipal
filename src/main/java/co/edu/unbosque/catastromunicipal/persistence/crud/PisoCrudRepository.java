package co.edu.unbosque.catastromunicipal.persistence.crud;

import co.edu.unbosque.catastromunicipal.persistence.entity.BloqueCasas;
import co.edu.unbosque.catastromunicipal.persistence.entity.Persona;
import co.edu.unbosque.catastromunicipal.persistence.entity.Piso;
import co.edu.unbosque.catastromunicipal.persistence.entity.PisoPK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PisoCrudRepository extends CrudRepository<Piso, PisoPK> {
    public Piso getById_Numero(Integer id);
    public Piso getById_Calle(String id);
    public Piso getById_Escalera(Character id);
    public Piso getById_Planta(Integer id);
    public Piso getById_Puerta(String id);
    Piso findById_NumeroAndId_CalleAndId_EscaleraAndId_PlantaAndId_Puerta(Integer numero, String calle, Character escalera, Integer level, String door);
    void deleteById_Numero(Integer id);
    void deleteById_Calle(String id);
    void deleteById_Escalera(Character id);
    void deleteById_Planta(Integer id);
    void deleteById_Puerta(String id);

}
