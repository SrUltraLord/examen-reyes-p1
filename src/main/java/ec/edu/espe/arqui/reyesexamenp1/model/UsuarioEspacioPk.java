package ec.edu.espe.arqui.reyesexamenp1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@Getter
@Setter
public class UsuarioEspacioPk implements Serializable {

    @Column(name = "COD_ESPACIO", nullable = false)
    private Integer codEspacio;

    @Column(name = "COD_USUARIO", nullable = false)
    private Integer codUsuario;

    public UsuarioEspacioPk(Integer codEspacio, Integer codUsuario) {
        this.codEspacio = codEspacio;
        this.codUsuario = codUsuario;
    }
}
