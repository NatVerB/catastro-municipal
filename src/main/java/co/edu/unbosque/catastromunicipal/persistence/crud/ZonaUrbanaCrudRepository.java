package co.edu.unbosque.catastromunicipal.persistence.crud;

import co.edu.unbosque.catastromunicipal.domain.UrbanZone;
import co.edu.unbosque.catastromunicipal.persistence.entity.ZonaUrbana;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ZonaUrbanaCrudRepository extends CrudRepository<ZonaUrbana,String> {
    public List<ZonaUrbana> findByNombreZona(String nombreZona);
    public void deleteByNombreZona(String nombreZona);
    public void getByNombreZona(String nombreZona);
}
