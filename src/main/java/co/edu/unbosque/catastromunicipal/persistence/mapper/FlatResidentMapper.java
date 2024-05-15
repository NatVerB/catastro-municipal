package co.edu.unbosque.catastromunicipal.persistence.mapper;

import co.edu.unbosque.catastromunicipal.domain.FlatResident;
import co.edu.unbosque.catastromunicipal.persistence.entity.HabitaPiso;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface FlatResidentMapper {
    @Mappings({
            @Mapping(source = "dni", target = "id"),
            @Mapping(source = "piso", target = "floor")
    })
    FlatResident toFlatResident(HabitaPiso habitaPiso);

    @InheritInverseConfiguration
    HabitaPiso toHabitaPiso(FlatResident flatResident);
}
