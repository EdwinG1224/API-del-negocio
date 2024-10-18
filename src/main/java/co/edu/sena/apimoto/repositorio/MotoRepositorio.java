package co.edu.sena.apimoto.repositorio;

import co.edu.sena.apimoto.entidad.Moto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MotoRepositorio extends JpaRepository<Moto, Long> {
}
