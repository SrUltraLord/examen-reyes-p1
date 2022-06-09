package ec.edu.espe.arqui.reyesexamenp1.dao;

import ec.edu.espe.arqui.reyesexamenp1.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}