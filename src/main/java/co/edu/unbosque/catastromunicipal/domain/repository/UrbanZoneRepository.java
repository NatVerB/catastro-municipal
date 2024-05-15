package co.edu.unbosque.catastromunicipal.domain.repository;

import co.edu.unbosque.catastromunicipal.domain.UrbanZone;

import java.util.List;

public interface UrbanZoneRepository {
    List<UrbanZone> getAllUrbanZones();
    List<UrbanZone> getUrbanZoneByName(String name);
    void deleteUrbanZoneByName(String name);
    UrbanZone saveUrbanZone(UrbanZone urbanZone);
    UrbanZone updateUrbanZone(UrbanZone urbanZone);
}
