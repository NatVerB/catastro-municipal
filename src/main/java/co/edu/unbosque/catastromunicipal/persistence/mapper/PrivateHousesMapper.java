package co.edu.unbosque.catastromunicipal.persistence.mapper;

import co.edu.unbosque.catastromunicipal.domain.PrivateHouse;
import co.edu.unbosque.catastromunicipal.persistence.entity.CasaParticular;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PrivateHousesMapper {
    @Mappings({
            @Mapping(source = "id.numero", target = "number"),
            @Mapping(source = "id.calle", target = "street"),
            @Mapping(source = "metrosC", target = "meters"),
            @Mapping(source = "odCasa", target = "houseOd"),
            @Mapping(source = "dniCp", target = "dniCp")
    })
    PrivateHouse toPrivateHouse(CasaParticular casaParticular);
    List<PrivateHouse> toPrivateHouses(List<CasaParticular> casaParticulars);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "persona", ignore = true),
            @Mapping(target = "vivienda", ignore = true)
    })
    CasaParticular toCasaParticular(PrivateHouse privateHouse);
}
