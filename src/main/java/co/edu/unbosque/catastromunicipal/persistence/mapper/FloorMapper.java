package co.edu.unbosque.catastromunicipal.persistence.mapper;

import co.edu.unbosque.catastromunicipal.domain.Floor;
import co.edu.unbosque.catastromunicipal.persistence.entity.Piso;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FloorMapper {
    @Mappings({
            @Mapping(source = "id.numero", target = "number"),
            @Mapping(source = "id.calle", target = "street"),
            @Mapping(source = "id.escalera", target = "stair"),
            @Mapping(source = "id.planta", target = "level"),
            @Mapping(source = "id.puerta", target = "door"),
            @Mapping(source = "metrosP", target = "meters"),
            @Mapping(source = "odPiso", target = "floorOd"),
            @Mapping(source = "dniP", target = "dniP")
    })
    Floor toFloor(Piso piso);
    List<Floor> toFloors(List<Piso> pisos);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "persona", ignore = true),
            @Mapping(target = "bloqueCasas", ignore = true),
            @Mapping(target = "habitaPiso", ignore = true)
    })
    Piso toPiso(Floor floor);
    List<Piso> toPisos(List<Floor> floors);
}
