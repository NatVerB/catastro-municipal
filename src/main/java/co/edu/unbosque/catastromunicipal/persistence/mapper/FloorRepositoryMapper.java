package co.edu.unbosque.catastromunicipal.persistence.mapper;

import co.edu.unbosque.catastromunicipal.domain.Floor;
import co.edu.unbosque.catastromunicipal.persistence.entity.Piso;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface FloorRepositoryMapper {
    @Mappings({
            @Mapping(source = "id.numero", target = "number"),
            @Mapping(source = "id.calle", target = "street"),
            @Mapping(source = "id.escalera", target = "stair"),
            @Mapping(source = "id.planta", target = "level"),
            @Mapping(source = "id.puerta", target = "door"),
            @Mapping(source = "metrosP", target = "meters"),
            @Mapping(source = "odPiso", target = "floorOd"),
            @Mapping(source = "bloqueCasas", target = "blockHouses"),
            @Mapping(source = "habitaPiso", target = "flatResident")
    })
    Floor toFloor(Piso piso);

    @InheritInverseConfiguration
    Piso toPiso(Floor floor);
}
