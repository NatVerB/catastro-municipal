package co.edu.unbosque.catastromunicipal.persistence.mapper;

import co.edu.unbosque.catastromunicipal.domain.Person;
import co.edu.unbosque.catastromunicipal.persistence.entity.Persona;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "apellido", target = "lastName"),
            @Mapping(source = "odPersona", target = "personOd"),
            @Mapping(source = "dniC", target = "dniC"),
            @Mapping(source = "numero", target = "number"),
            @Mapping(source = "calle", target = "street")

    })
    Person toPerson(Persona persona);
    List<Person> toPersons(List<Persona> personas);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "vivienda", ignore = true),
            @Mapping(target = "casaParticular", ignore = true)
    })
    Persona toPersona(Person persona);
    List<Persona> toPersonas(List<Persona> personas);
}
