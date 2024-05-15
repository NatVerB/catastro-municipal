package co.edu.unbosque.catastromunicipal.persistence.mapper;

import co.edu.unbosque.catastromunicipal.domain.Housing;
import co.edu.unbosque.catastromunicipal.persistence.entity.Vivienda;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HousingMapper {
    @Mappings({
            @Mapping(source = "id.numero", target = "number"),
            @Mapping(source = "id.calle", target = "street"),
            @Mapping(source = "tipo", target = "type"),
            @Mapping(source = "codigoPostal", target = "postalCode"),
            @Mapping(source = "metrosCuadrados", target = "meters"),
            @Mapping(source = "odVivienda", target = "housingOd"),
            @Mapping(source = "zonaUrbana", target = "urbanZone"),
            @Mapping(source = "bloqueCasas", target = "blockHouses"),
            @Mapping(source = "casaParticular", target = "privateHouse"),
            @Mapping(source = "personas", target = "people")
    })
    Housing toHousing(Vivienda vivienda);
    List<Housing> toHousingList(List<Vivienda> viviendas);

    @InheritInverseConfiguration
    Vivienda toVivienda(Housing housing);
}
