package ec.edu.espe.arqui.reyesexamenp1.dao;

import ec.edu.espe.arqui.reyesexamenp1.model.UsuarioEspacio;
import ec.edu.espe.arqui.reyesexamenp1.model.UsuarioEspacioPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioEspacioRepository extends JpaRepository<UsuarioEspacio, UsuarioEspacioPk> {
}