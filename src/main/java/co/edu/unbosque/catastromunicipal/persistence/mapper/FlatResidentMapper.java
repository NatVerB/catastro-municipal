package co.edu.unbosque.catastromunicipal.persistence.mapper;

import co.edu.unbosque.catastromunicipal.domain.FlatResident;
import co.edu.unbosque.catastromunicipal.persistence.entity.HabitaPiso;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FlatResidentMapper {

    @Mappings({
            @Mapping(source = "dni", target = "id"),
            @Mapping(source = "calle", target = "street"),
            @Mapping(source = "numero", target = "number"),
            @Mapping(source = "escalera", target = "stair"),
            @Mapping(source = "planta", target = "level"),
            @Mapping(source = "puerta", target = "door")
    })
    FlatResident toFlatResident(HabitaPiso habitaPiso);
    List<FlatResident> toFlatResidents(List<HabitaPiso> habitaPiso);


    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "piso", ignore = true),
            @Mapping(target = "persona", ignore = true)
    })
    HabitaPiso toHabitaPiso(FlatResident flatResident);
}
