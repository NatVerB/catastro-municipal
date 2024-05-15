package co.edu.unbosque.catastromunicipal.persistence.mapper;

import co.edu.unbosque.catastromunicipal.domain.BlockHouses;
import co.edu.unbosque.catastromunicipal.persistence.entity.BloqueCasas;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BlockHousesMapper {
    @Mappings({
            @Mapping(source = "id.numero", target = "number"),
            @Mapping(source = "id.calle", target = "street"),
            @Mapping(source = "metrosBloque", target = "blockMeters"),
            @Mapping(source = "odBloque", target = "blockOd"),
            @Mapping(source = "vivienda", target = "housing"),
            @Mapping(source = "pisos", target = "floors")
    })
    BlockHouses toBlockHouses(BloqueCasas bloqueCasas);
    List<BlockHouses> toBlockHouses(List<BloqueCasas> bloqueCasas);

    @InheritInverseConfiguration
    BloqueCasas toBloqueCasas(BlockHouses blockHouses);
}
