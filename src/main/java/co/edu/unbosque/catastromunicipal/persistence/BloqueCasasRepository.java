package co.edu.unbosque.catastromunicipal.persistence;

import co.edu.unbosque.catastromunicipal.persistence.crud.BloqueCasasCrudRepository;
import co.edu.unbosque.catastromunicipal.persistence.entity.BloqueCasas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BloqueCasasRepository {
    @Autowired
    private BloqueCasasCrudRepository bloqueCasasCrudRepository;

    public List<BloqueCasas> getBloqueCasas() {
        return (List<BloqueCasas>) bloqueCasasCrudRepository.findAll();
    }

    public List<BloqueCasas> getBloqueCasasByCalle(String calle){
        return bloqueCasasCrudRepository.findById_Calle(calle);
    }

    public List<BloqueCasas> getBloqueCasasByNumero(Integer numero){
        return bloqueCasasCrudRepository.findById_Numero(numero);
    }

    public void deleteByCalle(String calle){
        bloqueCasasCrudRepository.deleteById_Calle(calle);
    }

    public void deleteByNumero(Integer numero){
        bloqueCasasCrudRepository.deleteById_Numero(numero);
    }

    public BloqueCasas save (BloqueCasas bloque){
        return bloqueCasasCrudRepository.save(bloque);
    }

    public BloqueCasas update(BloqueCasas bloque){
        if (bloque.getId() != null && bloqueCasasCrudRepository.existsById(bloque.getId())) {
            return bloqueCasasCrudRepository.save(bloque);
        } else {
            throw new RuntimeException("No se puede actualizar el BloqueCasas porque no existe en la base de datos.");
        }
    }



}
