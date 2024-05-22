package co.edu.unbosque.catastromunicipal.persistence;

import co.edu.unbosque.catastromunicipal.domain.UrbanZone;
import co.edu.unbosque.catastromunicipal.domain.repository.UrbanZoneRepository;
import co.edu.unbosque.catastromunicipal.persistence.crud.ZonaUrbanaCrudRepository;
import co.edu.unbosque.catastromunicipal.persistence.entity.ZonaUrbana;
import co.edu.unbosque.catastromunicipal.persistence.mapper.UrbanZoneMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public class ZonaUrbanaRepository implements UrbanZoneRepository {
    @Autowired
    private ZonaUrbanaCrudRepository zonaUrbanaCrudRepository;
    @Autowired
    private UrbanZoneMapper mapper;

    @Override
    public List<UrbanZone> getAllUrbanZones() {
        List<ZonaUrbana> zonas = (List<ZonaUrbana>) zonaUrbanaCrudRepository.findAll();
        return mapper.toUrbanZones(zonas);
    }

    @Override
    public Optional<List<UrbanZone>> getUrbanZoneByName(String name) {
        List<ZonaUrbana> zonas = (List<ZonaUrbana>) zonaUrbanaCrudRepository.findByNombreZona(name);
        return Optional.of(mapper.toUrbanZones(zonas));
    }

    @Override
    public void deleteUrbanZoneByName(String name) {
        zonaUrbanaCrudRepository.deleteById(name);
    }

    @Override
    public UrbanZone saveUrbanZone(UrbanZone urbanZone) {
        ZonaUrbana zonaUrbana = mapper.toZonaUrbana(urbanZone);
        return mapper.toUrbanZone(zonaUrbanaCrudRepository.save(zonaUrbana));
    }

    @Override
    public UrbanZone updateUrbanZone(UrbanZone urbanZone) {
        ZonaUrbana zonaUrbana = mapper.toZonaUrbana(urbanZone);
        return mapper.toUrbanZone(zonaUrbanaCrudRepository.save(zonaUrbana));
    }
}
