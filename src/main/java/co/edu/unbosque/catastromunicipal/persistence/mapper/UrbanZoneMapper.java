package co.edu.unbosque.catastromunicipal.persistence.mapper;

import co.edu.unbosque.catastromunicipal.domain.UrbanZone;
import co.edu.unbosque.catastromunicipal.persistence.entity.ZonaUrbana;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UrbanZoneMapper {

    @Mappings({
            @Mapping(source = "nombreZona", target = "zoneName"),
            @Mapping(source = "odZona", target = "zoneOd"),
            @Mapping(source = "vivienda", target = "housings")
    })
    UrbanZone toUrbanZone(ZonaUrbana zonaUrbana);
    List<UrbanZone> toUrbanZones(List<ZonaUrbana> zonaUrbanas);

    @InheritInverseConfiguration
    ZonaUrbana toZonaUrbana(UrbanZone urbanZone);
}
