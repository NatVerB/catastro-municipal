package co.edu.unbosque.catastromunicipal.persistence;

import co.edu.unbosque.catastromunicipal.persistence.crud.BloqueCasasCrudRepository;
import co.edu.unbosque.catastromunicipal.persistence.entity.BloqueCasas;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BloqueCasasRepository {
    private BloqueCasasCrudRepository bloqueCasasCrudRepository;

    public List<BloqueCasas> getBloqueCasas() {
        return (List<BloqueCasas>) bloqueCasasCrudRepository.findAll();
    }



}
