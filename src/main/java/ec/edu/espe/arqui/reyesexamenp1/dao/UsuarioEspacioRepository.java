package ec.edu.espe.arqui.reyesexamenp1.dao;

import ec.edu.espe.arqui.reyesexamenp1.model.Espacio;
import ec.edu.espe.arqui.reyesexamenp1.model.Usuario;
import ec.edu.espe.arqui.reyesexamenp1.model.UsuarioEspacio;
import ec.edu.espe.arqui.reyesexamenp1.model.UsuarioEspacioPk;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioEspacioRepository extends JpaRepository<UsuarioEspacio, UsuarioEspacioPk> {
   UsuarioEspacio findByCodEspacioAndCodUsuario(Espacio espacio, Usuario usuario);
}