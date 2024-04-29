package co.edu.unbosque.catastromunicipal.persistence.crud;

import co.edu.unbosque.catastromunicipal.persistence.entity.BloqueCasas;
import co.edu.unbosque.catastromunicipal.persistence.entity.Persona;
import co.edu.unbosque.catastromunicipal.persistence.entity.Piso;
import co.edu.unbosque.catastromunicipal.persistence.entity.PisoPK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PisoCrudRepository extends CrudRepository<Piso, PisoPK> {
    public Iterable<Piso> findAll();
    public List<Piso> findAllByCalleAndNumero(BloqueCasas calle, BloqueCasas numero);
    public List<Piso> findAllByCalleAndNumeroAndEscalera(BloqueCasas calle, BloqueCasas numero, String escalera);
    public List<Piso> findAllByCalleAndNumeroAndPlantaPiso(BloqueCasas calle, BloqueCasas numero, Integer plantaPiso);
    public List<Piso> findAllByPersona(Persona persona);
    public List<Piso> findByCalleAndNumeroAndEscaleraAndPlantaPisoAndPuerta(BloqueCasas calle, BloqueCasas numero, String escalera, Integer plantaPiso, String puerta);
}
