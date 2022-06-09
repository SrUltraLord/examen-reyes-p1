package ec.edu.espe.arqui.reyesexamenp1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "SEG_USUARIO_ESPACIO")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class UsuarioEspacio implements Serializable {
    private static final long serialVersionUID = -9183710077510L;

    @EmbeddedId
    private UsuarioEspacioPk pk;

    @Column(name = "ESTADO", nullable = false)
    private String estado;

    public UsuarioEspacio(UsuarioEspacioPk pk) {
        this.pk = pk;
    }
}
