package ec.edu.espe.arqui.reyesexamenp1.dao;

import ec.edu.espe.arqui.reyesexamenp1.model.Espacio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EspacioRepository extends JpaRepository<Espacio, Integer> {
}